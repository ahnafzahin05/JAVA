# 🧑‍💻 Coder Army – Problem List  

A collection of **classic array & two-pointer problems**, categorized for better understanding and practice.  

---

## 🚀 Two Pointer Problems  

1. 🔵 **Segregate 0s and 1s**  
   Rearrange the array so that all `0`s appear before all `1`s.  
   - Approach-1: Brute Force – **O(n²)**  
   - Approach-2: Two Pointers – **O(n)** ✅  
   - Approach-3: Sliding Window – **O(n)**  

2. 🔵 **Move all zeroes to end**  
   Shift all zeros to the end while maintaining the relative order of non-zero elements.  
   - Approach-1: Brute Force (extra array) – **O(n)**, **O(n)** space  
   - Approach-2: Sliding Window – **O(n)**  
   - Approach-3: Two Pointers (optimal, in-place) – **O(n)** ✅  

3. 🔵 **Two Sum**  
   Find two numbers in the array whose sum equals a given target.  
   - Approach-1: Brute Force – **O(n²)**
   - Approach-2: Binary Search – **O(nlogn)**  
   - Approach-2: Two Pointers (after sorting) – **O(n log n + n)** ✅  

4. 🔵 **Two Difference**  
   Check if there exists a pair with the given difference.  
   - Approach-1: Brute Force – **O(n²)**  
   - Approach-2: Two Pointers (sorted) – **O(n log n + n)** ✅  

5. 🔵 **Product Pair**  
   Find if there exists a pair with the given product.  
   - Approach-1: Brute Force – **O(n²)**  

6. 🔵 **Pair sum closest to 0**  
   Find the pair whose sum is closest to zero.  
   - Approach-1: Brute Force – **O(n²)**  
   - Approach-2: Two Pointers (after sorting) – **O(n log n + n)** ✅  

---

## 📊 Prefix, Suffix & Subarray Problems  

7. 🟢 **Printing all sub-arrays**  
   Print all possible non-empty subarrays of the given array.  
   - Direct nested loops – **O(n³)** (to print all, unavoidable)  

8. 🟢 **Divide array into 2 subarrays with equal sum**  
   - Approach-1: Brute Force (split & sum every index) – **O(n²)**  
   - Approach-2: Prefix Sum – **O(n)** ✅  

9. 🟢 **Prefix and Suffix**  
   - Compute prefix sums – **O(n)**  
   - Compute suffix sums – **O(n)**  
   - Query handling – **O(1)** each  

10. 🟢 **Largest Sum Contiguous Subarray**  
    - Approach-1: Brute Force – **O(n³)**  
    - Approach-2: Prefix Sum – **O(n²)**  
    - Approach-3: Kadane’s Algorithm – **O(n)** ✅  

11. 🟢 **Kadane’s Algorithm**  
    Direct optimal method – **O(n)**  

12. 🟢 **Max difference between two elements**  
    Find `arr[j] - arr[i]` such that `j > i`.  
    - Approach-1: Brute Force – **O(n²)**  
    - Approach-2: Track min element while iterating – **O(n)** ✅  

---

## ⚡ Advanced Array Challenges  

13. 🟡 **Trapping Rain Water**  
    - Approach-1: Brute Force (check left & right for every index) – **O(n²)**  
    - Approach-2: Precompute Peak Index (first occurrence), LeftMax and RightMax – **O(n)**, **O(1)** space  ✅ 
    - Approach-3: Two Pointers (optimal, in-place) – **O(n)** ✅  

14. 🟡 **Three Sum**  
    Find three numbers in the array whose sum equals a given target.  
    - Approach-1: Brute Force (3 nested loops) – **O(n³)**  
    - Approach-2: Sorting + Two Pointers (reduce to 2Sum) – **O(n²)** ✅  

---

✨ **Legend:**  
- **Brute Force** = baseline slow solution  
- **Two Pointer / Sliding Window / Prefix-Suffix / Kadane’s** = optimized approaches  
- ✅ = most efficient / recommended solution  
