<h2><a href="https://leetcode.com/problems/boats-to-save-people/">881. Boats to Save People</a></h2> <h3>Medium</h3> <hr> <p>You are given an array <code>people</code> where <code>people[i]</code> is the weight of the <code>i<sup>th</sup></code> person, and an infinite number of boats where each boat can carry a maximum weight of <code>limit</code>.</p>

<p>Each boat can carry at most two people at the same time, provided the sum of their weights is at most <code>limit</code>.</p>

<p>Return the <strong>minimum number of boats</strong> required to carry every person.</p>

<p>&nbsp;</p> <p><strong class="example">Example 1:</strong></p> <pre> <strong>Input:</strong> people = [1,2], limit = 3 <strong>Output:</strong> 1 <strong>Explanation:</strong> One boat carries both people. </pre>

<p><strong class="example">Example 2:</strong></p> <pre> <strong>Input:</strong> people = [3,2,2,1], limit = 3 <strong>Output:</strong> 3 <strong>Explanation:</strong> Boats: (1,2), (2), (3) </pre>

<p><strong class="example">Example 3:</strong></p> <pre> <strong>Input:</strong> people = [3,5,3,4], limit = 5 <strong>Output:</strong> 4 <strong>Explanation:</strong> Each person needs a separate boat. </pre>

<p>&nbsp;</p> <p><strong>Constraints:</strong></p> <ul> <li><code>1 ≤ people.length ≤ 5 × 10<sup>4</sup></code></li> <li><code>1 ≤ people[i] ≤ limit ≤ 3 × 10<sup>4</sup></code></li> </ul>