# HotelApp-Springboot
Spring boot application to add and display hotels. Run the application using any IDE, the application automatically starts the server at http:localhost:8080/.

The Schema of the Hotel object contains 3 properties (id, name, address)

GET endpoint (http:localhost:8080/getHotels)
POST endpoint (http:localhost:8080/addHotel)

Request body for Post:
{
"name" : "hotel_name",
"address": "address_of_hotel"
}

The id of the hotel is incremented automatically.

Please find the screenshots attached below for the post and get requests.

GET:

<img width="641" alt="image" src="https://user-images.githubusercontent.com/113097023/223360752-9bdaa427-889f-4bd8-896c-bba50b193dbd.png">


POST:

<img width="641" alt="image" src="https://user-images.githubusercontent.com/113097023/223360869-2699f614-a66e-4dbb-839e-64392229207c.png">


