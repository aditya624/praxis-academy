from flask import Flask, render_template

app=Flask('web',template_folder='views')

@app.route('/')
def index():
    return 'Halo Semua'

@app.route('/hitung/<pertama>/<kedua>')
def hello_by_name(pertama,kedua):
    hasil=int(pertama)+int(kedua)
    return render_template('index.html', hasil=hasil)

#parameter
@app.route('/users/<id>')
def user_id(id):
    return f'ini user dengan id = {id}' # return f

app.run(debug=True)