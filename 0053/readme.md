<h2><a href="https://leetcode.com/problems/maximum-subarray/description/">53. Maximum Subarray</a></h2> <h3>Medium</h3> <hr> <p>Given an integer array <code>nums</code>, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.</p>

<p>This is a classic problem that can be solved efficiently using <strong>Kadane’s Algorithm</strong>, which maintains a running maximum and resets when the sum becomes negative.</p>

<p>&nbsp;</p> <p><strong class="example">Example 1:</strong></p> <pre> <strong>Input:</strong> nums = [-2,1,-3,4,-1,2,1,-5,4] <strong>Output:</strong> 6 <strong>Explanation:</strong> The subarray [4,-1,2,1] has the largest sum = 6. </pre>

<p><strong class="example">Example 2:</strong></p> <pre> <strong>Input:</strong> nums = [1] <strong>Output:</strong> 1 </pre>

<p><strong class="example">Example 3:</strong></p> <pre> <strong>Input:</strong> nums = [5,4,-1,7,8] <strong>Output:</strong> 23 </pre>

<p>&nbsp;</p> <p><strong>Constraints:</strong></p> <ul> <li><code>1 ≤ nums.length ≤ 10<sup>5</sup></code></li> <li><code>-10<sup>4</sup> ≤ nums[i] ≤ 10<sup>4</sup></code></li> </ul>

<p><strong>Follow-up:</strong> Try implementing a divide and conquer solution for this problem.</p>