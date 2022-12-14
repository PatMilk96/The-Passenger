FROM openjdk:17
COPY target/classes/ /tmp/
COPY target/test-classes/ /tmp/
WORKDIR /tmp
CMD java ie.atu.Passenger
CMD java ie.atu.PassengerTest