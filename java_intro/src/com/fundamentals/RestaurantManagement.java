package com.fundamentals;

import java.util.Scanner;

public class RestaurantManagement {

    static {
        System.out.println("WELCOME TO BAWARCHI RESTAURANT");
    }

    void displayMenu() {
        System.out.println("\n1. SOUPS");
        System.out.println("2. STARTERS");
        System.out.println("3. MAIN COURSE");
        System.out.println("4. DESSERT");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        RestaurantManagement rm = new RestaurantManagement();

        System.out.println("ARE YOU VEGETARIAN OR NON-VEGETARIAN?");
        String category = sc.next().toUpperCase();

        double price = 0;
        char continueOrder;

        do {

            switch (category) {

                // ================= VEG =================

                case "VEG" -> {

                    rm.displayMenu();

                    System.out.println("Enter your choice:");
                    int vegMenu = sc.nextInt();

                    switch (vegMenu) {

                        // ---------- SOUPS ----------
                        case 1 -> {

                            System.out.println("Which soup do you want?");
                            System.out.println("1. VEGIES");
                            System.out.println("2. CORN");
                            System.out.println("3. KOREAN");

                            String vegItem = sc.next().toUpperCase();

                            switch (vegItem) {

                                case "VEGIES" -> {
                                    System.out.println("Vegies soup cost is 200");
                                    price += 200;
                                }

                                case "CORN" -> {
                                    System.out.println("Corn soup cost is 300");
                                    price += 300;
                                }

                                case "KOREAN" -> {
                                    System.out.println("Korean style soup cost is 500");
                                    price += 500;
                                }

                                default -> {
                                    System.out.println("Invalid soup choice");
                                }
                            }
                        }

                        // ---------- STARTERS ----------
                        case 2 -> {

                            System.out.println("Which starter do you want?");
                            System.out.println("1. PANEER");
                            System.out.println("2. GOBI");
                            System.out.println("3. BABY CORN");

                            String starter = sc.next().toUpperCase();

                            switch (starter) {

                                case "PANEER" -> {
                                    System.out.println("Paneer starter cost is 250");
                                    price += 250;
                                }

                                case "GOBI" -> {
                                    System.out.println("Gobi starter cost is 200");
                                    price += 200;
                                }

                                case "BABY" -> {
                                    System.out.println("Baby corn cost is 220");
                                    price += 220;
                                }

                                default -> {
                                    System.out.println("Invalid starter choice");
                                }
                            }
                        }

                        // ---------- MAIN COURSE ----------
                        case 3 -> {

                            System.out.println("Which main course do you want?");
                            System.out.println("1. VEG BIRYANI");
                            System.out.println("2. PANEER BIRYANI");
                            System.out.println("3. VEG FRIED RICE");

                            String mainCourse = sc.next().toUpperCase();

                            switch (mainCourse) {

                                case "VEG" -> {
                                    System.out.println("Veg Biryani cost is 250");
                                    price += 250;
                                }

                                case "PANEER" -> {
                                    System.out.println("Paneer Biryani cost is 300");
                                    price += 300;
                                }

                                case "FRIED" -> {
                                    System.out.println("Veg Fried Rice cost is 220");
                                    price += 220;
                                }

                                default -> {
                                    System.out.println("Invalid main course choice");
                                }
                            }
                        }

                        // ---------- DESSERT ----------
                        case 4 -> {

                            System.out.println("Which dessert do you want?");
                            System.out.println("1. ICE CREAM");
                            System.out.println("2. GULAB JAMUN");
                            System.out.println("3. BROWNIE");

                            String dessert = sc.next().toUpperCase();

                            switch (dessert) {

                                case "ICE" -> {
                                    System.out.println("Ice cream cost is 100");
                                    price += 100;
                                }

                                case "GULAB" -> {
                                    System.out.println("Gulab Jamun cost is 120");
                                    price += 120;
                                }

                                case "BROWNIE" -> {
                                    System.out.println("Brownie cost is 150");
                                    price += 150;
                                }

                                default -> {
                                    System.out.println("Invalid dessert choice");
                                }
                            }
                        }

                        default -> {
                            System.out.println("Invalid menu choice");
                        }
                    }
                }

                // ================= NON VEG =================

                case "NON-VEG" -> {

                    rm.displayMenu();

                    System.out.println("Enter your choice:");
                    int nonVegMenu = sc.nextInt();

                    switch (nonVegMenu) {

                        case 1 -> {

                            System.out.println("Which soup do you want?");
                            System.out.println("1. CHICKEN SOUP");
                            System.out.println("2. MUTTON SOUP");

                            String soup = sc.next().toUpperCase();

                            switch (soup) {

                                case "CHICKEN" -> {
                                    System.out.println("Chicken soup cost is 300");
                                    price += 300;
                                }

                                case "MUTTON" -> {
                                    System.out.println("Mutton soup cost is 400");
                                    price += 400;
                                }

                                default -> {
                                    System.out.println("Invalid soup choice");
                                }
                            }
                        }

                        case 2 -> {

                            System.out.println("Which starter do you want?");
                            System.out.println("1. CHICKEN 65");
                            System.out.println("2. CHICKEN TIKKA");

                            String starter = sc.next().toUpperCase();

                            switch (starter) {

                                case "CHICKEN" -> {
                                    System.out.println("Chicken 65 cost is 300");
                                    price += 300;
                                }

                                case "TIKKA" -> {
                                    System.out.println("Chicken Tikka cost is 350");
                                    price += 350;
                                }

                                default -> {
                                    System.out.println("Invalid starter choice");
                                }
                            }
                        }

                        case 3 -> {

                            System.out.println("Which main course do you want?");
                            System.out.println("1. CHICKEN BIRYANI");
                            System.out.println("2. MUTTON BIRYANI");

                            String mainCourse = sc.next().toUpperCase();

                            switch (mainCourse) {

                                case "CHICKEN" -> {
                                    System.out.println("Chicken Biryani cost is 350");
                                    price += 350;
                                }

                                case "MUTTON" -> {
                                    System.out.println("Mutton Biryani cost is 450");
                                    price += 450;
                                }

                                default -> {
                                    System.out.println("Invalid main course choice");
                                }
                            }
                        }

                        case 4 -> {

                            System.out.println("Which dessert do you want?");
                            System.out.println("1. ICE CREAM");
                            System.out.println("2. GULAB JAMUN");

                            String dessert = sc.next().toUpperCase();

                            switch (dessert) {

                                case "ICE" -> {
                                    System.out.println("Ice cream cost is 100");
                                    price += 100;
                                }

                                case "GULAB" -> {
                                    System.out.println("Gulab Jamun cost is 120");
                                    price += 120;
                                }

                                default -> {
                                    System.out.println("Invalid dessert choice");
                                }
                            }
                        }

                        default -> {
                            System.out.println("Invalid menu choice");
                        }
                    }
                }

                default -> {
                    System.out.println("Invalid category!");
                    return;
                }
            }

            System.out.println("\nDo you want to order another item? (Y/N)");
            continueOrder = sc.next().toUpperCase().charAt(0);

        } while (continueOrder == 'Y');

        System.out.println("\n==============================");
        System.out.println("          BILL");
        System.out.println("==============================");
        System.out.println("Total Amount : ₹" + price);
        System.out.println("Thank You! Visit Again!");
        System.out.println("==============================");

        sc.close();
    }
}