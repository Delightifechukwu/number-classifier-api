# number-classifier-api
A Spring Boot API that classifies numbers based on mathematical properties and provides fun facts.

## Features
- Prime number check
- Perfect number detection
- Armstrong number detection
- Odd/even classification
- Digit sum calculation
- Fun facts about numbers

## API Endpoint
**GET** `/api/classify-number?number=371`

### Example Response (200 OK):
```json
{
    "number": 371,
    "is_prime": false,
    "is_perfect": false,
    "properties": ["odd"],
    "digit_sum": 11,
    "fun_fact": "Fun fact about 371"
}
```

### Example Response (400 Bad Request):
```json
{
    "error": "Invalid number format"
}
```

## Deployment
Deployed on Render. Use the following base URL:
`https://your-api-url.com`
