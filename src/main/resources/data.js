// Create a MEMBER
----------------------------
POST http://localhost:8080/members
Content-Type : application/json
{
	"alias" : "mramirez", 
	"name" : "Michael Ramirez"
}



// Create a CHATROOM
----------------------------
POST http://localhost:8080/chatRooms
Content-Type : application/json
{
  "roomName" : "Developer Chat Room"
}



// Add MEMBERS to a CHATROOM (Method 1) 
// Note: Previous members are not deleted
// Note: Sending the same URI twice has no effect
----------------------------
PATCH http://localhost:8080/chatRooms/1/members
Content-Type : text/uri-list
http://localhost:8080/members/1
http://localhost:8080/members/2
	
	

// Add Members to ChatRoom (Method 2)
// Notes: Previous members are deleted
----------------------------
PATCH http://localhost:8080/chatRooms/2
Content-Type : application/json	
{ 
	  "members": ["http://localhost:8080/members/3"]
}	
	


// Delete a Member from a Room
DELETE http://localhost:8080/chatRooms/1/members/3
No Content


