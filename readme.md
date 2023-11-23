## Kafka-Demo Application
Kafka Docs can be found [here](https://docs.spring.io/spring-kafka/reference/index.html)
### installation
to install kafka in your docker environment run:
1. cd docker-compose
2. docker-compose up

### kafka commands
1. to view the events => docker exec resources-kafka-1 kafka-console-consumer --bootstrap-server localhost:29092 --topic demoTopic --from-beginning

### Notes
1. to send a message to a topic, we need a producerFactory
2. we send the message using kafkaTemplate
3. to receive or consume a message, we need a DefaultConsumerFactory
4. we use @KafkaListener to consume the messages