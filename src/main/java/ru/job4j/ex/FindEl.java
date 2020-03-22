package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rls = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                rls = index;
                break;
            }
        }
        if (rls == -1) {
            throw new ElementNotFoundException("The element is missing");
        }
        return rls;
    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        //if contains throw ElementAbuseException
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        /*catch (ElementAbuseException ea) {
            ea.printStackTrace();
        } catch (ElementNotFoundException en) {
            en.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }*/
    }

    public static void main(String[] args) {
        String[] value = {"Ivan", "Petr", "Greg", "Jak"};
        try {
            int index = indexOf(value, "Greg");
            System.out.println("Index of elements is : " + index);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
