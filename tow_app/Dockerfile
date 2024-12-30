# Giai đoạn build
FROM maven:3.9-eclipse-temurin-17 AS build

WORKDIR /app
COPY pom.xml .  # Sao chép tệp pom.xml để cài đặt dependency
COPY src ./src  # Sao chép mã nguồn

# Tạo khóa JWT trong thư mục resources
# Tạo khóa JWT để sử dụng cho xác thực ứng dụng
# - app.key: Khóa riêng để ký JWT
# - app.pub: Khóa công khai để xác minh JWT
RUN mkdir -p src/main/resources && \
    openssl genpkey -algorithm RSA -outform PEM -out src/main/resources/app.key && \
    openssl rsa -pubout -in src/main/resources/app.key -out src/main/resources/app.pub

RUN mvn clean package -DskipTests  # Build ứng dụng và bỏ qua test

# Giai đoạn runtime
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
