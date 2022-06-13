package operators;

public class OperatorsApp {
    public static void main(String[] args) {
// Basic Operators
        String carModel = "Dodge Challenger SRT392";
        int price = 14900;
        int bankAmount = 100000;
        boolean isDamaged = true;

        System.out.println("Price of a" + carModel +":$" + price);

        int increasedPrice = price + 1000;

        System.out.println("Increased Price of a" + carModel +":$" + increasedPrice);

        int decreasedPrice = price - 1000;

        System.out.println("Increased Price of a" + carModel +":$" + decreasedPrice);

        int twoCars = price * 2;

        System.out.println("Increased Price of a" + carModel +":$" + twoCars);

        int carsYouCanBuy = bankAmount / price;

        System.out.println("You can buy" + carsYouCanBuy + "with your money");

        int remainingMoney = bankAmount % price;

        System.out.println("You have" +" " + remainingMoney + " "+ "left" + " after you buy" +carModel);

        System.out.println();

// Unary operators
        int priceNegative = -14999;
        int priceNegativeWithPlus = + priceNegative;
        System.out.println("Negative price with plus sign: $" +priceNegativeWithPlus);
        int priceNegativeWithMinus = - priceNegative;
        System.out.println("Negative price with plus sign: $" + priceNegativeWithMinus);
        int priceOneDollarIncrease = ++price;
        System.out.println("Price increase: $" + priceOneDollarIncrease);
        int priceOneDollarDecrease = --price;
        System.out.println("Price Decrease: $" + priceOneDollarDecrease);

        System.out.println("Car Damaged :" +" " + isDamaged);
        System.out.println("Car Damaged :" +" " + !isDamaged);

// Equality and relational operators
        System.out.println("Car's price equals to money in the bank" +" " +(price == bankAmount) );
        System.out.println("Car's price doesnt equals to money in the bank" + " " +(price != bankAmount) );
        System.out.println("Car's price greater than money in the bank" + " " +(price > bankAmount) );
        System.out.println("Car's price lesser than money in the bank" + " " +(price > bankAmount) );
        System.out.println("Car model data type is string" + " " +(carModel instanceof String));

//Tenary operators
        String damagedText = isDamaged ? "The car is damaged" : "The car is not damaged";
        System.out.println(damagedText);
        System.out.println();

//Logical Operators
        String worthSeeingText = !isDamaged || price <= 20000 ? "Its worth seeing" : "Not worth";
        System.out.println(worthSeeingText);

        String worthRepairingText = isDamaged && price <= 10000 ? "Its repairable" : "Not repairable";
        System.out.println(worthRepairingText);

//Assignment Operators
        price += 1000;
        System.out.println("Price increased: $" + price);
        price -= 1000;
        System.out.println("Price decreased: $" + price);
        price *= 2;
        System.out.println("Price multiplied: $" + price);
        price /= 2;
        System.out.println("Price divided: $" + price);
        price %= 10000;
        System.out.println("Price Remained: $" + price);


// Loops - Repeating code until specific condition is met
// While loop, start with while with a condition while (condition){}. First define a variable strictly outside. Run until condition is met. Check condition.
// Do while loop - do{ ..... } while (condition);. Do while run code first then check after code is executed.
// For loop for (initialzation; condition; update statement){}. Variable and condition inside. Best choice if we know how many iterations to do.
        // for (int = 1; i <=100 (Executed 100 times); i++){ sout}
// Continue is for if statement in loop (example if i == 10 then
// Break stop whole loop



    }
}
