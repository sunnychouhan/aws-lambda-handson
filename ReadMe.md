# Trigger Aws Lambda (Java)  from Aws API Gateway

Steps to run this project:

1. Clone this Git repository
2. Navigate to the folder `aws-lambda-handson`
3. Build the project with `mvn package`
4. Copy the Jar created in target folder
5. Upload to Lambda Function from Aws Console
6. Test from Curl command by invoking api gateway
7. curl -v -X POST  https://bdvntvn5qc.execute-api.eu-west-2.amazonaws.com/testenv/gateway-request-event -H 'Content-Type:application/json' -d '{"body":"Testing API Request event to Lambda Function"}'
