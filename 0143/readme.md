<h2><a href="https://leetcode.com/problems/reorder-list/description/">143. Reorder List</a></h2> <h3>Medium</h3> <hr> <p>You are given the head of a singly linked list. The list can be represented as:</p> <pre> L₀ → L₁ → … → Lₙ₋₁ → Lₙ </pre> <p>Reorder the list to be in the following form:</p> <pre> L₀ → Lₙ → L₁ → Lₙ₋₁ → L₂ → Lₙ₋₂ → … </pre>

<p>You may not modify the values in the list's nodes. Only the nodes themselves may be changed.</p>

<p>&nbsp;</p> <p><strong class="example">Example 1:</strong></p> <pre> <strong>Input:</strong> head = [1,2,3,4] <strong>Output:</strong> [1,4,2,3] </pre>

<p><strong class="example">Example 2:</strong></p> <pre> <strong>Input:</strong> head = [1,2,3,4,5] <strong>Output:</strong> [1,5,2,4,3] </pre>

<p>&nbsp;</p> <p><strong>Constraints:</strong></p> <ul> <li>The number of nodes in the list is in the range <code>[1, 5 × 10⁴]</code>.</li> <li><code>1 ≤ Node.val ≤ 1000</code></li> </ul>