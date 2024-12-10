package com.example.softlearning.applicationcore.entity.book.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class BookDTO {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ident")
    private int id;
    @Column(name = "edition")
    private int edition;
    @Column(name = "tittle")
    private String name;
    @Column(name = "writer")
    private String owner;
    @Column(name = "description")
    private String description;
    @Column(name = "type")
    private String  type;
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "release_date")
    private String publicationDate;
    @Column(name = "price")
    private double price;
    @Column(name = "weigth")
    private double weigth;
    @Column(name = "heigth")    
    private double heigth;
    @Column(name = "width")
    private double width;
    @Column(name = "depth")
    private double depth;
    @Column(name = "available")
    private boolean available;
    @Column(name = "fragile")
    private boolean fragile;


    
    private BookDTO() {
    }

    public BookDTO(String name, String owner, String description, String type, 
            String isbn, String publicationDate, int id, 
            int edition, double price, double weight, double heigth, double width, 
            double depth, boolean available, boolean fragile) {
        this.name = name;
        this.owner = owner;
        this.description = description;
        this.type = type;
        this.isbn = isbn;
        this.publicationDate = publicationDate;
        this.id = id;
        this.edition = edition;
        this.price = price;
        this.weigth = weigth;
        this.heigth = heigth;
        this.width = width;
        this.depth = depth;
        this.available = available;
        this.fragile = fragile;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public int getId() {
        return id;
    }

    public int getEdition() {
        return edition;
    }

    public double getPrice() {
        return price;
    }

    public double getWeigth() {
        return weigth;
    }

    public double getHeigth() {
        return heigth;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public boolean getAvailable() {
        return available;
    }

    public boolean getFragile() {
        return fragile;
    }

    @Override
    public String toString() {
        return "BookDTO [id=" + id + ", edition=" + edition + ", name=" + name + ", owner=" + owner + ", description="
                + description + ", type=" + type + ", isbn=" + isbn + ", publicationDate=" + publicationDate
                + ", price=" + price + ", weigth=" + weigth + ", heigth=" + heigth + ", width=" + width + ", depth="
                + depth + ", available=" + available + ", fragile=" + fragile + "]";
    }

    
}
