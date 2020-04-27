FROM gradle:jdk8
COPY src/ /app/src/
COPY build.gradle /app/
COPY docker-entrypoint.sh /app/
RUN chmod +x /app/docker-entrypoint.sh
CMD /app/docker-entrypoint.sh