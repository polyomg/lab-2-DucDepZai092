package poly.edu.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	String name;
	Double price;
	
//    // trường name (private) — Spring/Thymeleaf sẽ dùng getter để đọc
//    private String name;
//
//    // trường price (private)
//    private Double price;
//
//    // constructor không tham số (bắt buộc để Spring có thể khởi tạo khi binding)
//    public Product() {
//    }
//
//    // constructor đầy đủ để tiện tạo nhanh object (không bắt buộc)
//    public Product(String name, Double price) {
//        this.name = name;
//        this.price = price;
//    }
//
//    // getter cho name — MUST be public để Thymeleaf truy xuất ${product.name}
//    public String getName() {
//        return name;
//    }
//
//    // setter cho name — Spring binder dùng để set value từ form
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    // getter cho price
//    public Double getPrice() {
//        return price;
//    }
//
//    // setter cho price
//    public void setPrice(Double price) {
//        this.price = price;
//    }
//
//    // (tuỳ chọn) toString để debug dễ hơn
//    @Override
//    public String toString() {
//        return "Product{name='" + name + "', price=" + price + '}';
//    }
}
