## Messaging API

A simple RESTful API built with Spring Boot that simulates sending messages with delivery status.

---

## Features

* Send messages via API
* Retrieve all messages
* Simulated delivery status (`SENT` / `FAILED`)
* Clean layered architecture (Controller → Service → Model)

---

## Tech Stack

* Java
* Spring Boot
* Maven
* Postman (for testing)

---

## 📡 API Endpoints

### Send a message

```http
POST /messages
```

**Request body:**

```json
{
  "recipient": "+40712345678",
  "content": "Hello!"
}
```

---

### Get all messages

```http
GET /messages
```

---

---

## How to Run

1. Clone the repository:

```bash
git clone https://github.com/Rafaela/Messaging-API.git
```

2. Open in your IDE

3. Run the main Spring Boot application

4. API will be available at:

```id="r0b9du"
http://localhost:8080/messages
```

---

## Testing

You can test the API using Postman:

* Send a `POST` request to `/messages`
* Use `GET` to retrieve stored messages

---


