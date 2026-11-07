# SGQHPG05 - Rating 650

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Customer Reward Points Tracker

A loyalty program tracks customer reward points based on their purchases.
The system first adds bonus points, deducts expired points, and then  **increments the total points using the post-increment operator (`x++`)**  before updating the record.

```
rewardPoints = 120, bonusPoints = 30, expiredPoints = 10;

```

 **Expected Output:** 

```
Reward Points before post-increment 140
Reward Points after post-increment 141

```

Run the code and modify the values to test different scenarios!

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T04:51:18.065Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Given variables: Initial reward points, bonus points, and expired points
        int rewardPoints = 120, bonusPoints = 30, expiredPoints = 10;

        // Adjust reward points by adding bonus and subtracting expired points

        rewardPoints = rewardPoints+bonusPoints- expiredPoints;

        // Print reward points before post-increment
        System.out.println("Reward Points before post-increment "+rewardPoints++);  // Prints updated reward points before increment

        // Apply post-increment to update the total points


        // Print updated reward points after incrementing
        System.out.println("Reward Points after post-increment "+rewardPoints);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SGQHPG05)