package com.bellLabs.bellLabs_api.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class ShoppingList {
    @Id
    @GeneratedValue
    private int shoppingListId;

    private int userId;

    private String listName;

    //Not all shoppingLists will be linked to a meal plan
    private boolean isLinkedToMealPlan;

    private int mealPlanId;

//    @OneToMany(mappedBy = "shoppingList", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<ShoppingListItem> items = new ArrayList<>();

    //Getters & Setters


    public int getShoppingListId() {
        return shoppingListId;
    }

    public void setShoppingListId(int shoppingListId) {
        this.shoppingListId = shoppingListId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public boolean isLinkedToMealPlan() {
        return isLinkedToMealPlan;
    }

    public void setLinkedToMealPlan(boolean linkedToMealPlan) {
        isLinkedToMealPlan = linkedToMealPlan;
    }

    public int getMealPlanId() {
        return mealPlanId;
    }

    public void setMealPlanId(int mealPlanId) {
        this.mealPlanId = mealPlanId;
    }

//    public List<ShoppingListItem> getItems() {
//        return items;
//    }
//
//    public void setItems(List<ShoppingListItem> items) {
//        this.items = items;
//    }
}
