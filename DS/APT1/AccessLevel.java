public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        StringBuilder result = new StringBuilder();

        for (int permission : rights) {
            if (permission >= minPermission) {
                result.append('A'); // Allowed access
            } else {
                result.append('D'); // Denied access
            }
        }

        return result.toString();
    }
}
