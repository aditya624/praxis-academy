# Struktur Data 
1. List
2. Tuple
3. Dictionary

## List
List merupakan array/larik adalah kumpulan data yang di simpan secara bersamaan.

## Tupel
Sama seperti list tetapi elemen tidak dapat diubah.

## Dictionary 
Seperti jeason
### Contoh 1
```
>>> data={
...     'nama':'Aditya Pratama',
...     'nilai':'90',
... }
>>> print(data)
{'nama': 'Aditya Pratama', 'nilai': '90'}
>>> print(data['nama'])
Aditya Pratama
>>> print(data['nilai'])
90
>>> for key,value in data.items():
...     print(f'{key}-{value}')
... 
nama-Aditya Pratama
nilai-90
```

### Contoh 2
```
>>> data={
...     'nama':['Aditya',' Pratama'],
...     'nilai':['90','75'],
... }
>>> print(data)
{'nama': ['Aditya', ' Pratama'], 'nilai': ['90', '75']}
>>> print(data['nama'])
['Aditya', ' Pratama']
>>> print(data['nama'][1])
 Pratama
>>> print(data['nama'][0])
Aditya
>>> print(data['nilai'][0])
90
>>> print(data["nilai"][0])
90
```

# Fungsi
Kumpulan perintah/aktivitas yang dapat dipanggil untuk melakukannya berkali-kali

## Contoh 1
```
>>> def sapa():
...     print('halo')
... 
>>> def panggil(nama):
...     print(f'selamat datang, {nama}')
... 
>>> sapa()
halo
>>> panggil('adit')
selamat datang, adit
```

## Contoh 2
```
>>> def panggil(nama):
...     print('Selamat datang {}'.format(nama))
... 
>>> panggil('adit')
Selamat datang adit
```

