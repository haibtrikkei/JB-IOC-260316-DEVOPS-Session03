# Session 04: Docker Compose cơ bản

## 1. Mục tiêu cốt lõi
- Hiểu cấu trúc Docker Compose
- Viết file `docker-compose.yml`
- Chạy ứng dụng đa dịch vụ
- Phân biệt mạng Docker Compose
- Quản lý vòng đời dịch vụ

## 2. Khái niệm (Concepts)
- **Compose**: Công cụ định nghĩa chạy ứng dụng Docker
- **`docker-compose.yml`**: Tệp cấu hình dịch vụ
- **Service**: Dịch vụ riêng biệt, container
- **Network**: Mạng ảo cho container
- **Volume**: Cơ chế lưu trữ dữ liệu

## 3. Phân tích chi tiết
### Giới thiệu Docker Compose
- Trọng tâm
  - Định nghĩa, chạy ứng dụng đa-container
  - Cấu hình YAML đơn giản
  - Tiết kiệm thời gian, dễ quản lý
- Ví dụ
  - Web + DB -> Một file

### Cấu trúc cơ bản `docker-compose.yml`
- Trọng tâm
  - `version`: Phiên bản cú pháp Compose
  - `services`: Định nghĩa các dịch vụ
  - `networks`: Cấu hình mạng tùy chỉnh
  - `volumes`: Cấu hình lưu trữ dữ liệu
- Ví dụ
  - `MongoDB` -> `ports: "27017:27017"`

### Định nghĩa Service
- Trọng tâm
  - `image`: Tên ảnh Docker
  - `build`: Đường dẫn Dockerfile
  - `ports`: Ánh xạ cổng
  - `volumes`: Gắn kết volume
  - `environment`: Biến môi trường
  - `depends_on`: Thứ tự khởi động
- Ví dụ
  - Web app -> `image: nginx`

### Quản lý mạng trong Compose
- Trọng tâm
  - Mạng mặc định (default)
  - Mạng tùy chỉnh (custom)
  - Liên lạc nội bộ container
- Ví dụ
  - `backend` -> `frontend` qua tên dịch vụ

### Quản lý dữ liệu với Volume
- Trọng tâm
  - `named volumes`: Volume định danh
  - `bind mounts`: Gắn thư mục host
  - Giữ dữ liệu sau container xóa
- Ví dụ
  - Database -> `db_data`

### Lệnh Docker Compose
- Trọng tâm
  - `up`: Khởi tạo, chạy dịch vụ
  - `down`: Dừng, xóa dịch vụ
  - `ps`: Liệt kê trạng thái
  - `logs`: Xem nhật ký
  - `build`: Xây dựng ảnh
- Ví dụ
  - `docker compose up -d` -> Chạy nền

### Liên kết dịch vụ
- Trọng tâm
  - `depends_on`: Đảm bảo khởi động
  - Phân tách chức năng
  - Tăng tính mô-đun
- Ví dụ
  - `frontend` -> `backend`

### Các tùy chọn nâng cao
- Trọng tâm
  - `restart`: Chính sách khởi động lại
  - `healthcheck`: Kiểm tra sức khỏe
  - `extends`: Kế thừa cấu hình
  - `profiles`: Cấu hình theo môi trường
- Ví dụ
  - `always` -> Luôn khởi động lại

## 4. Ứng dụng thực tiễn
- Giải quyết vấn đề
  - Setup phức tạp -> Tối giản hóa
  - Phát triển cục bộ -> Nhất quán môi trường
- Thực tế
  - Môi trường Dev/Test
  - Ứng dụng vi dịch vụ

## 5. Từ khóa ghi nhớ (Keywords)
- `docker-compose.yml`
- `Service`
- `Network`
- `Volume`
- `depends_on`
- `docker compose up`
- `YAML`