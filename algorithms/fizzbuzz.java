// Write a program that outputs the string representation of numbers from 1 to n.

// But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.

// Example:

// n = 15,

// Return:
// [
//     "1",
//     "2",
//     "Fizz",
//     "4",
//     "Buzz",
//     "Fizz",
//     "7",
//     "8",
//     "Fizz",
//     "Buzz",
//     "11",
//     "Fizz",
//     "13",
//     "14",
//     "FizzBuzz"
// ]


class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> output = new ArrayList();
        
        for(int i=1; i<=n; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                output.add("FizzBuzz");
            } else if(i % 5 == 0) {
                output.add("Buzz");
            } else if(i % 3 == 0) {
                output.add("Fizz");
            } else {
                output.add(Integer.toString(i));
            }
        }
        
        return output;
    }
}

// I want to study this solution, it ran in 0ms
import java.util.AbstractList;
class Solution {
    public List<String> fizzBuzz(int n) {
          return new AbstractList<>() {

            @Override
            public int size() {
                return n;
            }

            @Override
            public String get(int i) {
                if (++i % 15 == 0) {
                    return "FizzBuzz";
                } else if (i % 5 == 0) {
                    return "Buzz";
                } else if (i % 3 == 0) {
                    return "Fizz";
                } else {
                    return Integer.toString(i);
                }
            }
        };
    }
}
