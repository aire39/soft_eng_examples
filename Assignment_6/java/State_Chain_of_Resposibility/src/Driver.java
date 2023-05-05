public class Driver {
    public static void main(String[] args) {

        Snack coke = new Snack("Coke", 1.25f, 5);
        Snack pepsi = new Snack("Pepsi", 1.25f, 7);
        Snack cheetos = new Snack("Cheetos", 1.50f, 3);
        Snack doritos = new Snack("Doritos", 1.50f, 2);
        Snack kitkat = new Snack("Kitkat", 2.0f, 4);
        Snack snickers_bar = new Snack("Snickers", 2.0f, 2);

        VendingMachine vending_machine = new VendingMachine();
        vending_machine.AddSnackToVendingMachine(VendingMachineCell.A0, snickers_bar);
        vending_machine.AddSnackToVendingMachine(VendingMachineCell.A1, coke);
        vending_machine.AddSnackToVendingMachine(VendingMachineCell.A2, pepsi);
        vending_machine.AddSnackToVendingMachine(VendingMachineCell.B0, doritos);
        vending_machine.AddSnackToVendingMachine(VendingMachineCell.B1, kitkat);
        vending_machine.AddSnackToVendingMachine(VendingMachineCell.B2, cheetos);

        vending_machine.ChooseItemByCell(VendingMachineCell.A0);
        vending_machine.InsertMoney(2.0f);
        vending_machine.Dispense();

        System.out.println("\n");

        vending_machine.ChooseItemByCell(VendingMachineCell.A0);
        vending_machine.InsertMoney(2.0f);
        vending_machine.Dispense();

        System.out.println("\n");

        vending_machine.ChooseItemByCell(VendingMachineCell.A0);
        vending_machine.InsertMoney(2.0f);
        vending_machine.Dispense();

        System.out.println("\n");

        vending_machine.ChooseItemByCell(VendingMachineCell.B1);
        vending_machine.InsertMoney(2.0f);
        vending_machine.Dispense();

        System.out.println("\n");

        vending_machine.PrintItemInfoByCell(VendingMachineCell.A0);
        vending_machine.PrintItemInfoByCell(VendingMachineCell.B2);
    }
}