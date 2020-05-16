# Getting Started 

Scroll down and read the bottom setups first

Using Embedded H2 Database 

http://localhost:8081/h2-console/

Rest Endpoints 

http://localhost:8081/api/
      
</br>

GET BY PARAM            /getproductdetails/{productId} </br>

http://localhost:8081/api/getproductdetails/{productId}


GET ALL, POST, PUT      /products </br>

http://localhost:8081/api/products


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

_______________________________________________________________________________
|                                                                              |
|                           Starting the application                           |
|                                                                              |
|______________________________________________________________________________|

>>Please download the file from github

>>import the application as existing maven project

>>run the application as Java application

>> now to get the values http://localhost:8081/api/products

>>The Tomcat and H2 DB are embedded within the application

>>No other installation needed other that Java and Eclipse
  

[------- nothing happened -------] 

>> if nothing appears instead of going to the earlier link press below link and see while it is in run mode 

>>The goto http://localhost:8081/h2-console/ 

>>enter user h2 and press connect

>>paste the sql statement and run

>> INSERT INTO PRODUCT (PRODUCT_ID,PRODUCT_NAME , PRODUCT_PRICE ) VALUES ('6321', 'shampoo', '69');

>> now to get the values http://localhost:8081/api/products


