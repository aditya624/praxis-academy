data=[80,90,100]
for index,val in enumerate(data):
    print(f'index{index}-{val}')

datas=[
    {
        'nama':'praxis',
        'nilai':[80,99,90]
    },
    {
        'nama':'padepokan ASA',
        'nilai':[100,65,77]
    },
]

for data1 in datas:
    print(f"{data[data1]}")

    #for nil in data['nilai']:
    #    print(nilai)