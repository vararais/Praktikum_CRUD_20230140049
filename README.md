GET Data Postman :
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/3c4a3adb-3bc5-40a9-be4a-2d55e59b85db" />

POST Data Postman :
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/68474bcc-ecfb-4799-910b-90d6e214a802" />

PUT Data Postman :
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/c15d32d5-5273-4fb6-81be-743a05954e89" />

DELETE Data Postman :
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/d99ef30b-48c3-4077-b329-2876cdf6792b" />

Halaman Website :
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/5f0b8356-4e9b-4439-b0c3-e062ac6a207d" />


# Dokumentasi API - Manajemen User

Dokumentasi ini berisi daftar *endpoint* untuk mengelola data User pada aplikasi Praktikum 1.

---

## 1. Create / Add
Menambahkan data user baru ke dalam database. ID akan di-*generate* secara otomatis menggunakan format UUID.

* **URL**: `/api/users`
* **Method**: `POST`
* **Header**:
    * `Content-Type: application/json`
    * `Accept: application/json`

**Request Body**
```json
{
  "name": "Muhammad Anan",
  "age": 21
}
```

**Hasil Sukses**
```json
{
  "status": "success",
  "data": {
    "id": "c56a4180-65aa-42ec-a945-5fd21dec0538",
    "name": "Muhammad Anan",
    "age": 21
  }
}
```

## 2. Get Data
Mendapatkan daftar seluruh user yang ada di dalam database.

---

* **URL**: `/api/users`
* **Method**: `GET`
* **Header**:
    * `Accept: application/json`

**Hasil Sukses**
```json
{
  "status": "success",
  "data": [
    {
      "id": "c56a4180-65aa-42ec-a945-5fd21dec0538",
      "name": "Muhammad Anan",
      "age": 21
    },
    {
      "id": "d12a4180-65bb-42ec-a945-5fd21dec0999",
      "name": "Budi Santoso",
      "age": 22
    }
  ]
}
```

## 3.Update Data
Memperbarui nama dan/atau umur dari user yang sudah ada di database berdasarkan ID.

---

* **URL**: `/api/users/id`
* **Method**: `PUT`
* **Header**:
    * `Content-Type: application/json`
    * `Accept: application/json`
* **Path** : ID (UUID) dari user yang ingin diperbarui.

**Request Body**
```json
{
  "name": "Muhammad Anan (Updated)",
  "age": 22
}
```

**Hasil Sukses**
```json
{
  "status": "success",
  "data": {
    "id": "c56a4180-65aa-42ec-a945-5fd21dec0538",
    "name": "Muhammad Anan (Updated)",
    "age": 22
  }
}
```

## 4. Delete Data
Menghapus data user dari database berdasarkan ID.

---

* **URL**: `/api/users/id`
* **Method**: `DELETE`
* **Header**:
    * `Content-Type: application/json`
    * `Accept: application/json`
* **Path**: ID (UUID) dari user yang ingin dihapus.

**Hasil Jadi**
```json
{
  "status": "success delete user with id c56a4180-65aa-42ec-a945-5fd21dec0538"
}
```
