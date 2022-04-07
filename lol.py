import requests
import json

#PROFE SI ESTA LEYENDO ESTO LE INFORMO QUE EL RESULTADO DE LA API ES LA IMAGEN DE UN PERRO PERO COMO LA ACTIVIDAD ERA UN .TXT SE LO MANDO ASI SI QUIERE VER AL PERRO DIGAME

if __name__ == '__main__':
    url = ' https://images.dog.ceo/breeds/terrier-dandie/n02096437_48.jpg'
    chapela = requests.get(url)

    if chapela.status_code == 200:
        content = chapela.content

        file = open('esunperro.jpg','wb')
        file.write(content)
        file.close()
