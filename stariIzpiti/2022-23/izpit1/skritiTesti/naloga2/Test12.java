
import java.util.*;

public class Test12 {

    public static void main(String[] args) {
        final char[][] B01 = {
            {'c'},
            {'p'},
            {'j'},
            {'s'},
            {'m'},
            {'n'},
            {'a'},
            {'j'},
            {'x'},
            {'t'},
            {'v'},
            {'x'},
            {'z'},
            {'j'},
            {'c'},
            {'j'},
            {'i'},
            {'q'},
            {'h'},
            {'j'},
            {'w'},
            {'s'},
            {'c'},
            {'t'},
            {'l'},
            {'u'},
            {'o'},
            {'v'},
            {'t'},
            {'t'},
            {'j'},
            {'f'},
            {'i'},
            {'y'},
            {'y'},
            {'j'},
            {'t'},
            {'m'},
            {'k'},
            {'s'},
            {'m'},
            {'p'},
            {'b'},
            {'q'},
            {'v'},
            {'v'},
            {'p'},
            {'x'},
            {'y'},
            {'m'},
            {'h'},
            {'l'},
            {'w'},
            {'w'},
            {'g'},
            {'r'},
            {'t'},
            {'t'},
            {'t'},
            {'g'},
            {'m'},
            {'f'},
            {'u'},
            {'s'},
            {'i'},
            {'f'},
            {'j'},
            {'z'},
            {'n'},
            {'x'},
            {'t'},
            {'r'},
            {'n'},
            {'x'},
            {'m'},
            {'d'},
            {'i'},
            {'i'},
            {'s'},
            {'u'},
            {'p'},
            {'i'},
            {'m'},
            {'h'},
            {'x'},
            {'w'},
            {'d'},
            {'h'},
            {'h'},
            {'r'},
            {'l'},
        };

        final char[][] P01 = {
            {'2', '9', 'n'},
            {'0', '9', 'v'},
            {'2', '6', 'n'},
            {'8', '1', 'n'},
            {'9', '4', 'v'},
            {'6', '4', 'n'},
            {'0', '5', 'v'},
            {'4', '9', 'v'},
            {'6', '0', 'n'},
            {'8', '0', 'n'},
            {'2', '1', 'n'},
            {'9', '1', 'n'},
            {'0', '0', 'n'},
            {'4', '9', 'n'},
            {'2', '9', 'n'},
            {'4', '9', 'n'},
            {'3', '2', 'v'},
            {'2', '5', 'v'},
            {'7', '7', 'n'},
            {'7', '1', 'v'},
            {'7', '2', 'v'},
            {'8', '1', 'v'},
            {'2', '9', 'v'},
            {'9', '7', 'n'},
            {'1', '6', 'v'},
            {'1', '0', 'n'},
            {'3', '0', 'v'},
            {'3', '3', 'n'},
            {'9', '7', 'v'},
            {'8', '0', 'n'},
            {'2', '6', 'n'},
            {'9', '8', 'v'},
            {'0', '3', 'v'},
            {'6', '8', 'v'},
            {'6', '8', 'n'},
            {'2', '6', 'v'},
            {'8', '0', 'v'},
            {'3', '8', 'v'},
            {'7', '6', 'v'},
            {'8', '7', 'n'},
            {'9', '2', 'n'},
            {'0', '9', 'v'},
            {'1', '5', 'v'},
            {'2', '5', 'v'},
            {'3', '3', 'v'},
            {'3', '3', 'n'},
            {'0', '9', 'v'},
            {'3', '9', 'n'},
            {'1', '8', 'v'},
            {'9', '9', 'v'},
            {'7', '7', 'v'},
            {'1', '6', 'v'},
            {'6', '2', 'n'},
            {'3', '1', 'v'},
            {'0', '4', 'n'},
            {'5', '1', 'n'},
            {'5', '4', 'n'},
            {'8', '0', 'v'},
            {'2', '3', 'v'},
            {'8', '3', 'v'},
            {'7', '9', 'v'},
            {'7', '8', 'n'},
            {'1', '0', 'n'},
            {'8', '1', 'v'},
            {'0', '3', 'v'},
            {'7', '8', 'v'},
            {'2', '6', 'v'},
            {'2', '0', 'n'},
            {'6', '4', 'n'},
            {'6', '0', 'n'},
            {'5', '4', 'n'},
            {'5', '1', 'v'},
            {'6', '4', 'n'},
            {'3', '9', 'n'},
            {'9', '2', 'n'},
            {'7', '3', 'v'},
            {'0', '3', 'n'},
            {'1', '2', 'n'},
            {'2', '4', 'n'},
            {'1', '0', 'n'},
            {'0', '9', 'n'},
            {'1', '2', 'n'},
            {'6', '7', 'n'},
            {'4', '0', 'n'},
            {'6', '0', 'n'},
            {'6', '2', 'n'},
            {'7', '3', 'v'},
            {'4', '0', 'n'},
            {'7', '7', 'n'},
            {'5', '1', 'n'},
            {'8', '8', 'n'},
        };

        final char[][] B02 = {
            {'v'},
            {'v'},
            {'t'},
            {'e'},
            {'i'},
            {'v'},
            {'t'},
            {'x'},
            {'p'},
            {'i'},
            {'n'},
            {'i'},
            {'z'},
            {'f'},
            {'f'},
            {'z'},
            {'f'},
            {'g'},
            {'u'},
            {'a'},
            {'v'},
            {'b'},
            {'k'},
            {'w'},
            {'f'},
            {'t'},
            {'h'},
            {'k'},
            {'m'},
            {'p'},
            {'a'},
            {'k'},
            {'m'},
            {'f'},
            {'o'},
            {'x'},
            {'x'},
            {'t'},
            {'s'},
            {'d'},
            {'w'},
            {'y'},
            {'v'},
            {'g'},
            {'b'},
            {'u'},
            {'z'},
            {'t'},
            {'d'},
            {'q'},
            {'w'},
            {'r'},
            {'u'},
            {'k'},
            {'o'},
            {'c'},
            {'m'},
            {'j'},
            {'y'},
            {'u'},
            {'r'},
            {'v'},
            {'x'},
            {'q'},
            {'s'},
            {'x'},
            {'b'},
            {'j'},
            {'f'},
            {'t'},
            {'t'},
            {'c'},
            {'d'},
        };

        final char[][] P02 = {
            {'2', '9', 'n'},
            {'8', '1', 'n'},
            {'2', '8', 'v'},
            {'3', '2', 'n'},
            {'8', '6', 'v'},
            {'2', '9', 'n'},
            {'6', '5', 'v'},
            {'8', '8', 'n'},
            {'2', '7', 'n'},
            {'6', '5', 'v'},
            {'7', '0', 'n'},
            {'2', '2', 'n'},
            {'7', '3', 'n'},
            {'0', '3', 'n'},
            {'9', '6', 'v'},
            {'3', '8', 'n'},
            {'0', '3', 'v'},
            {'1', '6', 'n'},
            {'3', '1', 'v'},
            {'9', '0', 'n'},
            {'9', '8', 'v'},
            {'0', '9', 'n'},
            {'4', '8', 'n'},
            {'8', '0', 'n'},
            {'0', '8', 'v'},
            {'1', '3', 'n'},
            {'7', '8', 'v'},
            {'4', '8', 'v'},
            {'3', '6', 'v'},
            {'2', '7', 'n'},
            {'4', '0', 'v'},
            {'4', '8', 'v'},
            {'5', '3', 'v'},
            {'1', '4', 'n'},
            {'3', '5', 'v'},
            {'0', '7', 'n'},
            {'2', '4', 'n'},
            {'8', '5', 'v'},
            {'9', '4', 'n'},
            {'0', '5', 'n'},
            {'6', '4', 'n'},
            {'2', '3', 'n'},
            {'2', '9', 'n'},
            {'3', '3', 'v'},
            {'6', '2', 'n'},
            {'1', '7', 'v'},
            {'7', '3', 'v'},
            {'1', '8', 'v'},
            {'7', '6', 'n'},
            {'7', '4', 'v'},
            {'0', '4', 'n'},
            {'9', '3', 'v'},
            {'3', '1', 'n'},
            {'5', '8', 'n'},
            {'3', '5', 'v'},
            {'5', '7', 'v'},
            {'3', '6', 'v'},
            {'2', '0', 'n'},
            {'2', '3', 'n'},
            {'9', '1', 'v'},
            {'4', '5', 'n'},
            {'9', '8', 'v'},
            {'8', '8', 'n'},
            {'3', '4', 'v'},
            {'0', '2', 'v'},
            {'0', '7', 'n'},
            {'8', '9', 'v'},
            {'2', '0', 'v'},
            {'5', '0', 'v'},
            {'1', '3', 'n'},
            {'2', '8', 'v'},
            {'6', '6', 'n'},
            {'0', '5', 'n'},
        };

        final char[][] B03 = {
            {'m'},
            {'l'},
            {'b'},
            {'h'},
            {'y'},
            {'m'},
            {'j'},
            {'b'},
            {'b'},
            {'u'},
            {'u'},
            {'u'},
            {'j'},
            {'u'},
            {'l'},
            {'u'},
            {'j'},
            {'x'},
            {'s'},
            {'e'},
            {'h'},
            {'q'},
            {'k'},
            {'u'},
            {'r'},
            {'v'},
            {'b'},
            {'x'},
            {'f'},
            {'l'},
            {'u'},
            {'b'},
            {'p'},
            {'p'},
            {'c'},
            {'u'},
            {'u'},
            {'w'},
            {'t'},
            {'s'},
            {'s'},
            {'c'},
            {'p'},
            {'m'},
            {'m'},
            {'u'},
            {'f'},
            {'g'},
            {'x'},
            {'f'},
            {'p'},
            {'w'},
            {'e'},
            {'l'},
            {'e'},
            {'z'},
            {'w'},
            {'h'},
            {'t'},
            {'d'},
        };

        final char[][] P03 = {
            {'1', '6', 'v'},
            {'7', '5', 'v'},
            {'7', '0', 'v'},
            {'4', '4', 'n'},
            {'8', '4', 'n'},
            {'0', '7', 'v'},
            {'2', '4', 'n'},
            {'4', '6', 'v'},
            {'7', '0', 'n'},
            {'2', '6', 'v'},
            {'3', '0', 'n'},
            {'9', '9', 'n'},
            {'5', '6', 'v'},
            {'3', '0', 'v'},
            {'2', '9', 'n'},
            {'9', '1', 'n'},
            {'5', '0', 'n'},
            {'0', '8', 'n'},
            {'1', '0', 'n'},
            {'1', '9', 'n'},
            {'4', '4', 'n'},
            {'1', '3', 'n'},
            {'0', '2', 'n'},
            {'9', '1', 'v'},
            {'9', '4', 'n'},
            {'8', '8', 'v'},
            {'4', '3', 'v'},
            {'5', '7', 'v'},
            {'5', '8', 'n'},
            {'2', '9', 'n'},
            {'3', '2', 'v'},
            {'8', '1', 'v'},
            {'5', '4', 'n'},
            {'5', '4', 'n'},
            {'4', '2', 'n'},
            {'3', '2', 'v'},
            {'9', '9', 'v'},
            {'3', '4', 'n'},
            {'7', '7', 'n'},
            {'0', '9', 'v'},
            {'1', '0', 'n'},
            {'6', '1', 'n'},
            {'6', '3', 'n'},
            {'9', '7', 'n'},
            {'9', '7', 'v'},
            {'2', '8', 'v'},
            {'4', '5', 'v'},
            {'2', '3', 'v'},
            {'2', '5', 'v'},
            {'4', '5', 'n'},
            {'6', '3', 'v'},
            {'3', '1', 'n'},
            {'1', '5', 'n'},
            {'8', '7', 'v'},
            {'8', '9', 'v'},
            {'4', '9', 'n'},
            {'3', '4', 'n'},
            {'4', '4', 'n'},
            {'0', '7', 'n'},
            {'7', '4', 'n'},
        };

        final char[][] B04 = {
            {'m'},
            {'y'},
            {'e'},
            {'q'},
            {'f'},
            {'y'},
            {'p'},
            {'o'},
            {'l'},
            {'f'},
            {'h'},
            {'m'},
            {'n'},
            {'n'},
            {'v'},
            {'k'},
            {'b'},
            {'q'},
            {'e'},
            {'z'},
            {'p'},
            {'m'},
            {'t'},
            {'m'},
            {'c'},
            {'d'},
            {'c'},
            {'y'},
            {'s'},
            {'k'},
            {'t'},
            {'d'},
            {'f'},
            {'f'},
            {'c'},
            {'t'},
            {'h'},
            {'z'},
            {'b'},
            {'c'},
            {'o'},
            {'q'},
            {'b'},
            {'y'},
            {'s'},
            {'b'},
            {'n'},
            {'z'},
            {'w'},
            {'y'},
            {'k'},
            {'m'},
            {'z'},
            {'m'},
            {'w'},
            {'r'},
            {'k'},
            {'q'},
            {'a'},
            {'q'},
            {'c'},
            {'o'},
            {'h'},
            {'m'},
            {'n'},
            {'l'},
            {'y'},
            {'y'},
            {'i'},
            {'n'},
            {'d'},
            {'z'},
            {'z'},
            {'l'},
            {'t'},
            {'t'},
            {'z'},
            {'u'},
            {'n'},
            {'n'},
        };

        final char[][] P04 = {
            {'0', '7', 'n'},
            {'2', '5', 'n'},
            {'6', '1', 'v'},
            {'2', '8', 'n'},
            {'9', '6', 'v'},
            {'4', '6', 'v'},
            {'2', '9', 'n'},
            {'9', '0', 'n'},
            {'6', '9', 'n'},
            {'9', '6', 'v'},
            {'5', '2', 'v'},
            {'9', '2', 'n'},
            {'3', '8', 'n'},
            {'3', '0', 'v'},
            {'5', '6', 'n'},
            {'8', '0', 'n'},
            {'4', '5', 'n'},
            {'4', '2', 'n'},
            {'6', '1', 'v'},
            {'6', '7', 'n'},
            {'2', '9', 'n'},
            {'9', '2', 'n'},
            {'8', '3', 'v'},
            {'9', '2', 'v'},
            {'4', '8', 'n'},
            {'1', '1', 'n'},
            {'1', '7', 'n'},
            {'0', '2', 'n'},
            {'6', '4', 'v'},
            {'5', '1', 'n'},
            {'3', '2', 'n'},
            {'2', '7', 'n'},
            {'9', '6', 'v'},
            {'3', '6', 'v'},
            {'8', '6', 'v'},
            {'8', '3', 'v'},
            {'1', '5', 'v'},
            {'1', '2', 'n'},
            {'3', '1', 'n'},
            {'4', '8', 'n'},
            {'5', '0', 'v'},
            {'4', '2', 'n'},
            {'3', '1', 'v'},
            {'0', '2', 'n'},
            {'6', '4', 'n'},
            {'4', '9', 'n'},
            {'4', '0', 'n'},
            {'1', '2', 'n'},
            {'0', '0', 'v'},
            {'0', '2', 'v'},
            {'2', '1', 'n'},
            {'9', '8', 'v'},
            {'7', '6', 'n'},
            {'8', '8', 'n'},
            {'5', '7', 'v'},
            {'7', '4', 'n'},
            {'5', '4', 'n'},
            {'7', '8', 'n'},
            {'4', '4', 'n'},
            {'2', '8', 'v'},
            {'3', '9', 'v'},
            {'9', '0', 'v'},
            {'1', '5', 'v'},
            {'8', '7', 'n'},
            {'4', '0', 'n'},
            {'6', '9', 'v'},
            {'2', '2', 'n'},
            {'2', '5', 'n'},
            {'0', '3', 'n'},
            {'3', '8', 'v'},
            {'8', '4', 'v'},
            {'1', '8', 'n'},
            {'1', '2', 'n'},
            {'6', '9', 'n'},
            {'0', '1', 'n'},
            {'9', '5', 'v'},
            {'6', '7', 'v'},
            {'9', '9', 'n'},
            {'3', '8', 'n'},
            {'3', '0', 'n'},
        };

        final char[][] B05 = {
            {'j'},
            {'i'},
            {'a'},
            {'h'},
            {'o'},
            {'e'},
            {'f'},
            {'y'},
            {'h'},
            {'y'},
            {'i'},
            {'f'},
            {'m'},
            {'g'},
            {'p'},
            {'x'},
            {'t'},
        };

        final char[][] P05 = {
            {'6', '7', 'n'},
            {'5', '5', 'n'},
            {'9', '2', 'v'},
            {'7', '6', 'v'},
            {'5', '9', 'n'},
            {'3', '1', 'n'},
            {'7', '2', 'v'},
            {'6', '2', 'n'},
            {'7', '6', 'v'},
            {'6', '2', 'v'},
            {'4', '9', 'v'},
            {'4', '5', 'n'},
            {'3', '3', 'n'},
            {'8', '4', 'v'},
            {'4', '3', 'v'},
            {'8', '6', 'v'},
            {'3', '6', 'v'},
        };

        final char[][] B06 = {
            {'d'},
            {'h'},
            {'a'},
            {'s'},
            {'c'},
            {'d'},
            {'i'},
            {'n'},
            {'s'},
            {'p'},
            {'p'},
            {'b'},
            {'i'},
            {'l'},
            {'i'},
            {'n'},
            {'c'},
            {'x'},
            {'r'},
            {'c'},
            {'r'},
            {'v'},
            {'i'},
            {'o'},
            {'p'},
            {'z'},
            {'o'},
            {'o'},
            {'s'},
            {'d'},
            {'a'},
            {'w'},
            {'o'},
            {'j'},
            {'n'},
            {'y'},
            {'s'},
            {'j'},
            {'h'},
            {'b'},
        };

        final char[][] P06 = {
            {'0', '2', 'n'},
            {'2', '8', 'n'},
            {'6', '4', 'v'},
            {'1', '0', 'n'},
            {'4', '9', 'v'},
            {'0', '7', 'v'},
            {'3', '6', 'v'},
            {'6', '4', 'n'},
            {'1', '0', 'n'},
            {'3', '1', 'n'},
            {'3', '3', 'v'},
            {'6', '1', 'v'},
            {'8', '8', 'n'},
            {'7', '5', 'n'},
            {'9', '6', 'v'},
            {'7', '9', 'n'},
            {'4', '9', 'v'},
            {'3', '4', 'n'},
            {'6', '3', 'n'},
            {'4', '9', 'v'},
            {'6', '3', 'v'},
            {'7', '6', 'v'},
            {'6', '7', 'v'},
            {'2', '7', 'n'},
            {'3', '3', 'n'},
            {'7', '7', 'n'},
            {'6', '5', 'n'},
            {'0', '5', 'n'},
            {'6', '8', 'v'},
            {'6', '0', 'v'},
            {'2', '6', 'n'},
            {'9', '1', 'v'},
            {'2', '7', 'v'},
            {'4', '4', 'v'},
            {'3', '7', 'n'},
            {'5', '3', 'v'},
            {'6', '8', 'v'},
            {'4', '4', 'v'},
            {'2', '8', 'n'},
            {'6', '1', 'v'},
        };

        final char[][] B07 = {
            {'s'},
            {'f'},
            {'s'},
            {'s'},
            {'i'},
            {'e'},
            {'i'},
            {'g'},
            {'e'},
            {'q'},
            {'i'},
            {'b'},
            {'y'},
            {'n'},
            {'j'},
            {'e'},
            {'o'},
            {'b'},
            {'b'},
            {'o'},
            {'y'},
            {'j'},
            {'q'},
            {'d'},
            {'c'},
            {'h'},
            {'v'},
            {'t'},
            {'v'},
            {'v'},
            {'q'},
            {'u'},
            {'o'},
            {'h'},
            {'s'},
            {'u'},
            {'u'},
            {'h'},
            {'j'},
            {'e'},
            {'m'},
            {'m'},
            {'t'},
            {'j'},
            {'m'},
            {'x'},
            {'o'},
            {'m'},
            {'u'},
            {'t'},
            {'n'},
            {'g'},
            {'j'},
            {'z'},
            {'i'},
            {'i'},
            {'h'},
            {'t'},
        };

        final char[][] P07 = {
            {'6', '6', 'v'},
            {'4', '1', 'n'},
            {'2', '8', 'v'},
            {'6', '6', 'n'},
            {'8', '3', 'n'},
            {'8', '7', 'v'},
            {'5', '4', 'n'},
            {'7', '3', 'v'},
            {'4', '7', 'v'},
            {'0', '2', 'v'},
            {'8', '3', 'v'},
            {'1', '8', 'v'},
            {'8', '9', 'n'},
            {'2', '3', 'n'},
            {'7', '9', 'n'},
            {'4', '7', 'n'},
            {'3', '0', 'v'},
            {'1', '8', 'n'},
            {'1', '8', 'n'},
            {'3', '0', 'v'},
            {'8', '9', 'n'},
            {'2', '7', 'n'},
            {'9', '7', 'n'},
            {'0', '5', 'v'},
            {'0', '7', 'v'},
            {'2', '1', 'n'},
            {'4', '2', 'v'},
            {'1', '3', 'n'},
            {'0', '1', 'v'},
            {'4', '2', 'n'},
            {'9', '0', 'v'},
            {'5', '3', 'n'},
            {'3', '0', 'v'},
            {'3', '6', 'n'},
            {'0', '4', 'v'},
            {'1', '5', 'n'},
            {'5', '3', 'n'},
            {'6', '7', 'n'},
            {'7', '9', 'v'},
            {'2', '4', 'v'},
            {'2', '0', 'v'},
            {'1', '6', 'n'},
            {'1', '3', 'v'},
            {'0', '6', 'v'},
            {'2', '0', 'v'},
            {'3', '5', 'n'},
            {'9', '4', 'n'},
            {'6', '8', 'v'},
            {'1', '5', 'v'},
            {'5', '6', 'n'},
            {'9', '2', 'n'},
            {'7', '3', 'n'},
            {'0', '6', 'n'},
            {'5', '7', 'n'},
            {'8', '0', 'v'},
            {'6', '4', 'v'},
            {'0', '3', 'v'},
            {'1', '7', 'v'},
        };

        final char[][] B08 = {
            {'y'},
            {'v'},
            {'r'},
            {'n'},
            {'z'},
            {'e'},
            {'n'},
            {'d'},
            {'g'},
            {'o'},
            {'s'},
            {'m'},
            {'b'},
            {'r'},
            {'b'},
            {'s'},
            {'j'},
            {'j'},
            {'c'},
            {'p'},
            {'o'},
            {'e'},
            {'b'},
            {'s'},
            {'w'},
            {'j'},
            {'i'},
            {'t'},
            {'r'},
            {'o'},
            {'i'},
            {'w'},
            {'i'},
            {'q'},
            {'y'},
            {'w'},
            {'t'},
            {'e'},
            {'w'},
            {'z'},
            {'i'},
            {'w'},
            {'n'},
            {'i'},
            {'i'},
            {'k'},
            {'o'},
            {'y'},
            {'n'},
            {'o'},
            {'b'},
            {'n'},
            {'w'},
            {'k'},
            {'y'},
            {'k'},
            {'j'},
            {'y'},
            {'z'},
            {'a'},
            {'l'},
            {'d'},
            {'b'},
            {'i'},
            {'a'},
            {'w'},
            {'i'},
            {'j'},
            {'v'},
            {'n'},
            {'f'},
            {'a'},
            {'t'},
            {'n'},
            {'s'},
            {'r'},
            {'t'},
            {'z'},
            {'g'},
            {'w'},
            {'z'},
            {'h'},
            {'i'},
        };

        final char[][] P08 = {
            {'5', '8', 'n'},
            {'0', '8', 'v'},
            {'3', '0', 'v'},
            {'3', '2', 'v'},
            {'4', '9', 'v'},
            {'2', '4', 'v'},
            {'0', '6', 'v'},
            {'3', '3', 'v'},
            {'5', '0', 'n'},
            {'9', '0', 'n'},
            {'6', '5', 'v'},
            {'2', '0', 'v'},
            {'1', '3', 'v'},
            {'5', '6', 'n'},
            {'2', '1', 'n'},
            {'6', '5', 'n'},
            {'3', '1', 'n'},
            {'7', '3', 'n'},
            {'1', '8', 'n'},
            {'2', '3', 'v'},
            {'8', '7', 'v'},
            {'9', '1', 'n'},
            {'9', '9', 'v'},
            {'7', '0', 'n'},
            {'6', '9', 'n'},
            {'9', '2', 'v'},
            {'9', '4', 'n'},
            {'6', '2', 'n'},
            {'5', '6', 'v'},
            {'7', '6', 'v'},
            {'8', '4', 'v'},
            {'9', '6', 'v'},
            {'4', '3', 'v'},
            {'2', '7', 'v'},
            {'5', '8', 'v'},
            {'2', '5', 'v'},
            {'6', '3', 'v'},
            {'9', '1', 'n'},
            {'2', '5', 'v'},
            {'8', '3', 'v'},
            {'8', '9', 'n'},
            {'5', '2', 'v'},
            {'0', '6', 'v'},
            {'9', '4', 'n'},
            {'7', '4', 'n'},
            {'2', '6', 'n'},
            {'8', '7', 'n'},
            {'1', '1', 'v'},
            {'3', '6', 'v'},
            {'9', '5', 'v'},
            {'1', '5', 'n'},
            {'3', '2', 'n'},
            {'6', '9', 'n'},
            {'6', '1', 'v'},
            {'9', '7', 'v'},
            {'6', '1', 'n'},
            {'0', '4', 'n'},
            {'1', '1', 'v'},
            {'8', '3', 'n'},
            {'3', '5', 'v'},
            {'8', '1', 'v'},
            {'1', '4', 'n'},
            {'9', '9', 'v'},
            {'4', '3', 'v'},
            {'1', '2', 'v'},
            {'5', '2', 'v'},
            {'8', '4', 'n'},
            {'0', '4', 'n'},
            {'1', '7', 'n'},
            {'3', '6', 'n'},
            {'0', '1', 'v'},
            {'6', '0', 'n'},
            {'6', '3', 'n'},
            {'3', '6', 'v'},
            {'7', '8', 'v'},
            {'3', '0', 'v'},
            {'7', '2', 'n'},
            {'2', '2', 'v'},
            {'5', '0', 'v'},
            {'2', '5', 'n'},
            {'0', '0', 'n'},
            {'7', '5', 'n'},
            {'8', '9', 'v'},
        };

        final char[][] B09 = {
            {'w'},
            {'o'},
            {'e'},
            {'b'},
            {'b'},
            {'r'},
            {'m'},
            {'q'},
            {'e'},
            {'j'},
            {'w'},
            {'k'},
            {'t'},
            {'i'},
            {'t'},
            {'k'},
            {'n'},
            {'x'},
            {'h'},
            {'w'},
            {'j'},
            {'h'},
            {'i'},
            {'z'},
            {'q'},
            {'v'},
            {'q'},
            {'u'},
            {'a'},
            {'n'},
            {'h'},
            {'q'},
            {'a'},
            {'q'},
            {'r'},
            {'c'},
            {'t'},
            {'u'},
            {'t'},
            {'z'},
            {'c'},
            {'f'},
            {'k'},
            {'j'},
            {'y'},
            {'b'},
            {'j'},
            {'c'},
            {'x'},
            {'b'},
            {'c'},
            {'m'},
            {'f'},
            {'u'},
            {'i'},
            {'w'},
            {'s'},
            {'e'},
            {'u'},
            {'k'},
            {'g'},
            {'a'},
            {'r'},
            {'i'},
            {'s'},
            {'v'},
            {'k'},
            {'z'},
            {'e'},
            {'v'},
        };

        final char[][] P09 = {
            {'5', '3', 'v'},
            {'8', '9', 'v'},
            {'9', '7', 'v'},
            {'6', '9', 'n'},
            {'6', '8', 'v'},
            {'6', '3', 'v'},
            {'4', '5', 'v'},
            {'0', '9', 'n'},
            {'0', '4', 'v'},
            {'1', '9', 'v'},
            {'1', '1', 'n'},
            {'1', '6', 'v'},
            {'6', '5', 'n'},
            {'8', '6', 'n'},
            {'1', '0', 'v'},
            {'1', '7', 'n'},
            {'7', '9', 'v'},
            {'5', '2', 'v'},
            {'3', '6', 'n'},
            {'1', '1', 'v'},
            {'1', '9', 'v'},
            {'7', '6', 'v'},
            {'8', '6', 'v'},
            {'8', '1', 'v'},
            {'0', '0', 'n'},
            {'9', '2', 'v'},
            {'0', '9', 'n'},
            {'7', '1', 'n'},
            {'1', '2', 'n'},
            {'7', '9', 'v'},
            {'9', '9', 'v'},
            {'6', '4', 'n'},
            {'1', '2', 'n'},
            {'5', '8', 'v'},
            {'2', '7', 'n'},
            {'5', '1', 'n'},
            {'1', '0', 'n'},
            {'7', '1', 'n'},
            {'1', '0', 'n'},
            {'4', '7', 'v'},
            {'5', '6', 'v'},
            {'6', '1', 'n'},
            {'4', '6', 'v'},
            {'5', '5', 'v'},
            {'4', '8', 'v'},
            {'6', '9', 'n'},
            {'1', '9', 'v'},
            {'5', '6', 'v'},
            {'5', '2', 'v'},
            {'0', '8', 'v'},
            {'5', '1', 'v'},
            {'7', '4', 'v'},
            {'6', '1', 'n'},
            {'8', '1', 'n'},
            {'8', '6', 'v'},
            {'6', '6', 'n'},
            {'3', '5', 'n'},
            {'9', '7', 'n'},
            {'7', '1', 'n'},
            {'4', '6', 'n'},
            {'6', '7', 'v'},
            {'1', '2', 'n'},
            {'4', '0', 'v'},
            {'0', '5', 'v'},
            {'9', '8', 'n'},
            {'0', '3', 'v'},
            {'1', '7', 'n'},
            {'9', '5', 'n'},
            {'9', '7', 'n'},
            {'3', '1', 'v'},
        };

        final char[][] B10 = {
            {'e'},
            {'w'},
            {'r'},
            {'y'},
            {'y'},
            {'w'},
            {'o'},
            {'t'},
            {'s'},
            {'w'},
            {'g'},
            {'q'},
            {'v'},
            {'f'},
            {'e'},
            {'u'},
            {'l'},
            {'v'},
            {'l'},
            {'d'},
            {'g'},
            {'e'},
            {'c'},
            {'n'},
            {'b'},
            {'i'},
            {'p'},
            {'n'},
            {'a'},
            {'y'},
            {'g'},
            {'p'},
            {'b'},
        };

        final char[][] P10 = {
            {'0', '3', 'v'},
            {'0', '1', 'n'},
            {'1', '0', 'v'},
            {'6', '5', 'n'},
            {'3', '3', 'n'},
            {'2', '6', 'v'},
            {'9', '5', 'n'},
            {'9', '3', 'n'},
            {'1', '4', 'v'},
            {'6', '8', 'v'},
            {'3', '9', 'n'},
            {'6', '1', 'v'},
            {'9', '2', 'v'},
            {'8', '6', 'n'},
            {'1', '1', 'n'},
            {'8', '9', 'n'},
            {'6', '8', 'v'},
            {'5', '6', 'v'},
            {'5', '1', 'v'},
            {'4', '6', 'n'},
            {'3', '9', 'n'},
            {'7', '4', 'v'},
            {'2', '9', 'n'},
            {'6', '0', 'n'},
            {'8', '3', 'v'},
            {'9', '9', 'n'},
            {'2', '4', 'n'},
            {'8', '4', 'n'},
            {'7', '0', 'v'},
            {'3', '3', 'v'},
            {'5', '0', 'v'},
            {'0', '0', 'v'},
            {'7', '9', 'n'},
        };

        System.out.println(Druga.krizankaOK(B01, P01));
        System.out.println(Druga.krizankaOK(B02, P02));
        System.out.println(Druga.krizankaOK(B03, P03));
        System.out.println(Druga.krizankaOK(B04, P04));
        System.out.println(Druga.krizankaOK(B05, P05));
        System.out.println(Druga.krizankaOK(B06, P06));
        System.out.println(Druga.krizankaOK(B07, P07));
        System.out.println(Druga.krizankaOK(B08, P08));
        System.out.println(Druga.krizankaOK(B09, P09));
        System.out.println(Druga.krizankaOK(B10, P10));
    }
}