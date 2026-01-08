package com.food.fooddelivery.model;

    public class User {
        private long id;
        private String name;
        private String address;
        private String no;
        private String email;
        private String type;
        private String preference;

        public User() {}

        public User(long id, String name, String address, String no, String email, String type, String preference) {
            this.id = id;
            this.name = name;
            this.address = address;
            this.no = no;
            this.email = email;
            this.type = type;
            this.preference = preference;
        }

        public long getId() { return id; }
        public void setId(long id) { this.id = id; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getAddress() { return address; }
        public void setAddress(String address) { this.address = address; }

        public String getNo() { return no; }
        public void setNo(String no) { this.no = no; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }

        public String getType() { return type; }
        public void setType(String type) { this.type = type; }

        public String getPreference() { return preference; }
        public void setPreference(String preference) { this.preference = preference; }
    }
