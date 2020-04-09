# Getting Started


Using Embedded H2 Database 

http://localhost:8081/h2-console/


Rest Endpoints 

http://localhost:8081/api/
      
</br>

GET BY PARAM            /getproductdetails/{productId} </br>

GET ALL, POST, PUT      /products </br>

DELETE                  /products/{productId}    </br>
      
  
      

GET BY PARAM            /getconfigdetails/{LaptopId} </br>

GET ALL, POST, PUT      /SystemConfig </br>

DELETE                  /SystemConfig/{LaptopId}   </br>

</br>


Post

{  
    "productId": "0982",  
    "productName": "Coconut oil",  
    "productPrice": "35"  
}

</br>
Post 
{  
    
    "laptopId": "1000",  
    
    "laptopName": "Lenovo", 
     
    "laptopRam": "3" ,
    
    "laptopProcessor":"Intel",
    
    "laptopOS": "WIN10"
    
}

</br>

GET for All  /products

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

</br>
