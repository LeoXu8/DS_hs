public class SandwichBar {
    public int whichOrder(String[] available, String[] orders) {
        for (int i = 0; i < orders.length; i++) {
            String[] orderIngredients = orders[i].split(" ");
            boolean canMakeOrder = true;

            for (String ingredient : orderIngredients) {
                boolean hasIngredient = false;
                for (String availableIngredient : available) {
                    if (ingredient.equals(availableIngredient)) {
                        hasIngredient = true;
                        break;
                    }
                }

                if (!hasIngredient) {
                    canMakeOrder = false;
                    break;
                }
            }

            if (canMakeOrder) {
                return i;
            }
        }

        return -1;
    }
}
