<h2><a href="https://leetcode.com/problems/combination-sum/">39. Combination Sum</a></h2> <h3>Medium</h3> <hr> <p>Given an array of distinct integers <code>candidates</code> and a target integer <code>target</code>, return a list of all unique combinations of <code>candidates</code> where the chosen numbers sum to <code>target</code>.</p>

<p>You may return the combinations in any order. The same number may be chosen from <code>candidates</code> an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.</p>

<p>The test cases are generated such that the number of unique combinations that sum up to <code>target</code> is less than 150 combinations for the given input.</p>

<p>&nbsp;</p> <p><strong class="example">Example 1:</strong></p> <pre> <strong>Input:</strong> candidates = [2,3,6,7], target = 7 <strong>Output:</strong> [[2,2,3],[7]] </pre>

<p><strong class="example">Example 2:</strong></p> <pre> <strong>Input:</strong> candidates = [2,3,5], target = 8 <strong>Output:</strong> [[2,2,2,2],[2,3,3],[3,5]] </pre>

<p><strong class="example">Example 3:</strong></p> <pre> <strong>Input:</strong> candidates = [2], target = 1 <strong>Output:</strong> [] </pre>

<p>&nbsp;</p> <p><strong>Constraints:</strong></p> <ul> <li><code>1 ≤ candidates.length ≤ 30</code></li> <li><code>2 ≤ candidates[i] ≤ 40</code></li> <li>All elements of <code>candidates</code> are distinct.</li> <li><code>1 ≤ target ≤ 40</code></li> </ul>