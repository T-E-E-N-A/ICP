<h2><a href="https://leetcode.com/problems/house-robber/">198. House Robber</a></h2> <h3>Medium</h3> <hr> <p>You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, and the only constraint is that adjacent houses have security systems connected — robbing two directly adjacent houses will trigger the alarm.</p>

<p>Given an integer array <code>nums</code> representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.</p>

<p>&nbsp;</p> <p><strong class="example">Example 1:</strong></p> <pre> <strong>Input:</strong> nums = [1,2,3,1] <strong>Output:</strong> 4 <strong>Explanation:</strong> Rob house 1 (money = 1) and then house 3 (money = 3). Total = 1 + 3 = 4. </pre>

<p><strong class="example">Example 2:</strong></p> <pre> <strong>Input:</strong> nums = [2,7,9,3,1] <strong>Output:</strong> 12 <strong>Explanation:</strong> Rob house 1 (money = 2), house 3 (money = 9), and house 5 (money = 1). Total = 2 + 9 + 1 = 12. </pre>

<p>&nbsp;</p> <p><strong>Constraints:</strong></p> <ul> <li><code>1 ≤ nums.length ≤ 100</code></li> <li><code>0 ≤ nums[i] ≤ 400</code></li> </ul>