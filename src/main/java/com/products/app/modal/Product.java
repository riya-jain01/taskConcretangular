package com.products.app.modal;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="p_id")
	private Integer pId;
	@NotBlank
	@Column
	private String name;
	//@NotBlank
	@Lob
	@Column
	private byte[] imgPath;
	@NotBlank
	@Column
	private String color;
	@NotBlank
	@Column
	private String price;	
	//@NotBlank
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cId")
	private Category category;
	
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte[] getImgPath() {
		return imgPath;
	}
	public void setImgPath(byte[] imgPath) {
		this.imgPath = imgPath;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", name=" + name + ", imgPath=" + Arrays.toString(imgPath) + ", color=" + color
				+ ", price=" + price + ", category=" + category + "]";
	}	
}
