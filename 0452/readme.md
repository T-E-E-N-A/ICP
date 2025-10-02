<h2><a href="https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/">452. Minimum Number of Arrows to Burst Balloons</a></h2> <h3>Medium</h3> <hr> <p>You are given an array <code>points</code> where <code>points[i] = [x<sub>start</sub>, x<sub>end</sub>]</code> represents the horizontal diameter of a balloon. Balloons are fixed on a flat wall (XY-plane), and arrows can be shot vertically upward from any point on the x-axis.</p>

<p>An arrow shot at position <code>x</code> will burst all balloons where <code>x<sub>start</sub> ≤ x ≤ x<sub>end</sub></code>. Return the <strong>minimum number of arrows</strong> required to burst all balloons.</p>

<p>&nbsp;</p> <p><strong class="example">Example 1:</strong></p> <pre> <strong>Input:</strong> points = [[10,16],[2,8],[1,6],[7,12]] <strong>Output:</strong> 2 <strong>Explanation:</strong>

Shoot an arrow at x = 6 to burst [2,8] and [1,6].

Shoot another at x = 11 to burst [10,16] and [7,12]. </pre>

<p><strong class="example">Example 2:</strong></p> <pre> <strong>Input:</strong> points = [[1,2],[3,4],[5,6],[7,8]] <strong>Output:</strong> 4 <strong>Explanation:</strong> Each balloon requires a separate arrow. </pre>

<p><strong class="example">Example 3:</strong></p> <pre> <strong>Input:</strong> points = [[1,2],[2,3],[3,4],[4,5]] <strong>Output:</strong> 2 <strong>Explanation:</strong>

Arrow at x = 2 bursts [1,2] and [2,3].

Arrow at x = 4 bursts [3,4] and [4,5]. </pre>

<p>&nbsp;</p> <p><strong>Constraints:</strong></p> 
<ul> 
    <li><code>1 ≤ points.length ≤ 10<sup>5</sup></code></li> 
    <li><code>points[i].length == 2</code></li> 
    <li><code>-2<sup>31</sup> ≤ x<sub>start</sub> &lt; x<sub>end</sub> ≤ 2<sup>31</sup> - 1</code></li> 
</ul>