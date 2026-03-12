


## 1. Run MongoDB

Start MongoDB before running the backend.

If `mongod` is available in your terminal:

```bash
mongod
```

If MongoDB needs a data folder on Windows, create one and run:

```bash
mongod --dbpath C:\data\db
```

MongoDB will run on the default port: `27017`.

## 2. Run the backend

Open a terminal in the `backend` folder and run:

```bash
mvn spring-boot:run
```

The backend will start on:

```text
http://localhost:8080
```

## 3. Run Angular

Open a second terminal in the project root and run:

```bash
npm install
npm start
```

Angular will start on:

```text
http://localhost:4200
```

In development, Angular uses a proxy so requests to `/api` are forwarded to `http://localhost:8080`.

## 4. URLs to test

Frontend:

- `http://localhost:4200`

Backend API:

- `http://localhost:8080/api/services`
- `http://localhost:8080/api/packages`
- `http://localhost:8080/api/testimonials`

Contact endpoint:

- `POST http://localhost:8080/api/contact`

Example JSON body:

```json
{
  "name": "Sara",
  "email": "sara@example.com",
  "message": "I want to plan my graduation party."
}
```

## 5. Useful commands

Frontend build:

```bash
npm run build
```

Backend tests:

```bash
cd backend
mvn test
```
=======
# forever-plan-project
>>>>>>> bfac4bd04e049fb7e7ecbe21cf714334221887e2
