package com.example.bodymassindex;

public class BMI_Suman {
    private float height, weight;


    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    public float calculateBMI(){
        return weight/(height*height);
    }
}
