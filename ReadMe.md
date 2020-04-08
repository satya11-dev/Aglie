# Getting Started

Using Embedded H2 Database 

Rest Endpoints 

http://localhost:8081/api/
      
      

GET BY PARAM            /getproductdetails/{productId}
GET ALL, POST, PUT      /products
DELETE                  /products/{productId}
      
      

GET BY PARAM            /getconfigdetails/{LaptopId}
GET ALL, POST, PUT      /SystemConfig
DELETE                  /SystemConfig/{LaptopId}




Post

{  
    "productId": "0982",  
    "productName": "Coconut oil",  
    "productPrice": "35"  
}


Post 
{  
    "laptopId": "1000",  
    "laptopName": "Lenovo",  
    "laptopRam": "3" ,
    "laptopProcessor":"Intel",
    "laptopOS": "WIN10"
}


GET ALL FOR PRODUCT

[
	{  
    "productId": "0982",  
    "productName": "Coconut oil",  
    "productPrice": "35"  
},  
{  
    "productId": "6321",  
    "productName": "Shampoo",  
    "productPrice": "59"  
},  
{  
    "productId": "5433",  
    "productName": "Zandu balm",  
    "productPrice": "670"  
}
]
