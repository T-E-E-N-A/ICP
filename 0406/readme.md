<h2><a href="https://leetcode.com/problems/queue-reconstruction-by-height/">406. Queue Reconstruction by Height</a></h2> <h3>Medium</h3> <hr> <p>You are given an array <code>people</code>, where <code>people[i] = [h<sub>i</sub>, k<sub>i</sub>]</code> represents the <code>i<sup>th</sup></code> person with height <code>h<sub>i</sub></code> and exactly <code>k<sub>i</sub></code> people in front of them who have a height greater than or equal to <code>h<sub>i</sub></code>.</p>

<p>Reconstruct and return the queue that is represented by the input array <code>people</code>. The returned queue should be formatted as an array <code>queue</code>, where <code>queue[j] = [h<sub>j</sub>, k<sub>j</sub>]</code> is the attributes of the <code>j<sup>th</sup></code> person in the queue (<code>queue[0]</code> is the person at the front of the queue).</p>

<p>&nbsp;</p> <p><strong class="example">Example 1:</strong></p> <pre> <strong>Input:</strong> people = [[7,0],[4,4],[7,1],[5,0],[6,1],[5,2]] <strong>Output:</strong> [[5,0],[7,0],[5,2],[6,1],[4,4],[7,1]] </pre>

<p><strong class="example">Example 2:</strong></p> <pre> <strong>Input:</strong> people = [[6,0],[5,0],[4,0],[3,2],[2,2],[1,4]] <strong>Output:</strong> [[4,0],[5,0],[2,2],[3,2],[1,4],[6,0]] </pre>

<p>&nbsp;</p> <p><strong>Constraints:</strong></p> 
<ul> 
    <li><code>1 ≤ people.length ≤ 2000</code></li> 
    <li><code>0 ≤ h<sub>i</sub> ≤ 10<sup>6</sup></code></li> 
    <li><code>0 ≤ k<sub>i</sub> &lt; people.length</code></li> 
    <li>It is guaranteed that the queue can be reconstructed.</li> 
</ul>