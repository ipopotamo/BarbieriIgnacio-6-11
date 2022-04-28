import requests
   
url = 'https://images.dog.ceo/breeds/terrier-dandie/n02096437_48.jpg'
    
   
R = requests.get(url)
H = str(R.headers)
B = str(R.json())

file = open('headers.txt','w')
file.write(H)
file.close()

file = open('body.txt','w')
file.write(B)
file.close()