import requests
import json


if __name__ == '__main__':
    
	url = 'https://images.dog.ceo/breeds/terrier-dandie/n02096437_48.jpg'
    
	response = requests.get(url)
     
	headers_response = response.headers

	
	print(headers_response)
    #file = open('encabezadoperro.txt','wb')
    #file.write(headers_response)
    #file.close()