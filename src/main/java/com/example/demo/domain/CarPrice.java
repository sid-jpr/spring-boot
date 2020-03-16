package com.example.demo.domain;

import java.sql.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car_price")
public class CarPrice {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long price_id;
    private Double antitheft_charges;
    private Double auto_card_charges;
    private Timestamp creation_date;
    private Double drive_assure;
    private Double essential_kit_charges;
    private Double exshowroom_price;
    private Double extended_warranty_charges;
    private Double handling_charges;
    private Double insurance_charges;
    private Timestamp last_updated;
    private Double logistic_charges;
    private Double mcd_charges;
    private Double number_plate;
    private Double onroad_price;
    private Double rto_charges;
    private Double secure;
    private Double smart_card_charges;
    private Double standard_accessories_charges;
    private Double stock_yard_charges;
    private Double teflon_coating;
    private Double warehousing_charges;
    private Integer city_id;
    private Integer variant_id;
    private Timestamp end_date;
    private Timestamp created_at;
    
    public CarPrice()
    {
    }    
    
    public Integer getcity_id(){  
        return city_id;
    }
    public void setcity_id(Integer city_id){
        this.city_id = city_id;
    }
    public Integer getvariant_id(){  
        return variant_id;
    }
    public void setvariant_id(Integer variant_id){
        this.variant_id = variant_id;
    }
    
    
    public Long getprice_id(){  
        return price_id;
    }
    public void setprice_id(Long price_id){
        this.price_id = price_id;
    }
    
    
    public Double getantitheft_charges(){  
        return antitheft_charges;
    }
    public void setantitheft_charges(Double antitheft_charges){
        this.antitheft_charges = antitheft_charges;
    }
    public Double getauto_card_charges(){  
        return auto_card_charges;
    }
    public void setauto_card_charges(Double auto_card_charges){
        this.auto_card_charges = auto_card_charges;
    }
    public Double getdrive_assure(){  
        return drive_assure;
    }
    public void setdrive_assure(Double drive_assure){
        this.drive_assure = drive_assure;
    }
    public Double getessential_kit_charges(){  
        return essential_kit_charges;
    }
    public void setessential_kit_charges(Double essential_kit_charges){
        this.essential_kit_charges = essential_kit_charges;
    }
    public Double getexshowroom_price(){  
        return exshowroom_price;
    }
    public void setexshowroom_price(Double exshowroom_price){
        this.exshowroom_price = exshowroom_price;
    }
    public Double getextended_warranty_charges(){  
        return extended_warranty_charges;
    }
    public void setextended_warranty_charges(Double extended_warranty_charges){
        this.extended_warranty_charges = extended_warranty_charges;
    }
    public Double gethandling_charges(){  
        return handling_charges;
    }
    public void sethandling_charges(Double handling_charges){
        this.handling_charges = handling_charges;
    }
    public Double getinsurance_charges(){  
        return insurance_charges;
    }
    public void setinsurance_charges(Double insurance_charges){
        this.insurance_charges = insurance_charges;
    }
    public Double getlogistic_charges(){  
        return logistic_charges;
    }
    public void setlogistic_charges(Double logistic_charges){
        this.logistic_charges = logistic_charges;
    }
    public Double getmcd_charges(){  
        return mcd_charges;
    }
    public void setmcd_charges(Double mcd_charges){
        this.mcd_charges = mcd_charges;
    }
    public Double getnumber_plate(){  
        return number_plate;
    }
    public void setnumber_plate(Double number_plate){
        this.number_plate = number_plate;
    }
    public Double getonroad_price(){  
        return onroad_price;
    }
    public void setonroad_price(Double onroad_price){
        this.onroad_price = onroad_price;
    }
    public Double getrto_charges(){  
        return rto_charges;
    }
    public void setrto_charges(Double rto_charges){
        this.rto_charges = rto_charges;
    }
    public Double getsecure(){  
        return secure;
    }
    public void setsecure(Double secure){
        this.secure = secure;
    }
    public Double getsmart_card_charges(){  
        return smart_card_charges;
    }
    public void setsmart_card_charges(Double smart_card_charges){
        this.smart_card_charges = smart_card_charges;
    }
    public Double getstandard_accessories_charges(){  
        return standard_accessories_charges;
    }
    public void setstandard_accessories_charges(Double standard_accessories_charges){
        this.standard_accessories_charges = standard_accessories_charges;
    }
    public Double getstock_yard_charges(){  
        return stock_yard_charges;
    }
    public void setstock_yard_charges(Double stock_yard_charges){
        this.stock_yard_charges = stock_yard_charges;
    }
    public Double getteflon_coating(){  
        return teflon_coating;
    }
    public void setteflon_coating(Double teflon_coating){
        this.teflon_coating = teflon_coating;
    }
    public Double getwarehousing_charges(){  
        return warehousing_charges;
    }
    public void setwarehousing_charges(Double warehousing_charges){
        this.warehousing_charges = warehousing_charges;
    }
    
    
    public Timestamp getcreation_date(){  
        return creation_date;
    }
    public void setcreation_date(Timestamp creation_date){
        this.creation_date = creation_date;
    }
    public Timestamp getlast_updated(){  
        return last_updated;
    }
    public void setlast_updated(Timestamp last_updated){
        this.last_updated = last_updated;
    }
    public Timestamp getend_date(){  
        return end_date;
    }
    public void setend_date(Timestamp end_date){
        this.end_date = end_date;
    }
    public Timestamp getcreated_at(){  
        return created_at;
    }
    public void setcreated_at(Timestamp created_at){
        this.created_at = created_at;
    }
}
