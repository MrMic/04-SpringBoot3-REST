# Basic GET request
GET http://localhost:8085/api/students
User-Agent: hurl/1.0
Accept: application/json

# Basic GET request for specific student
GET http://localhost:8085/api/students/2
User-Agent: hurl/1.0
Accept: application/json

# Basic GET request for specific student (BAD)
GET http://localhost:8085/api/students/aa
User-Agent: hurl/1.0
Accept: application/json
