# kafkaExamples
This Project covers how to use Spring Boot with Spring Kafka to produce JSON/String message to Kafka topics and Consume JSON/String message from Kafka topics.

Commands :

--To start zookeeper

.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

--To start kafka server

.\bin\windows\kafka-server-start.bat .\config\server.properties

--To create topic

.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic kafkaExample

.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic kafkaExampleJson

--Publish to kafka topic

.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic 	kafkaExample --from-beginning

.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic kafkaExampleJson 
