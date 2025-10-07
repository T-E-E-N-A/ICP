<h2><a href="https://leetcode.com/problems/online-stock-span/">901. Online Stock Span</a></h2> <h3>Medium</h3> <hr> <p>Design an algorithm that collects daily price quotes for a stock and returns the <strong>span</strong> of that stock's price for the current day.</p>

<p>The <strong>span</strong> of the stock's price today is defined as the maximum number of consecutive days (starting from today and going backward) for which the price of the stock was less than or equal to today's price.</p>

<p>Implement the <code>StockSpanner</code> class:</p> <ul> <li><code>StockSpanner()</code> initializes the object.</li> <li><code>int next(int price)</code> returns the span of the stock's price for the given <code>price</code>.</li> </ul>

<p>&nbsp;</p> <p><strong class="example">Example:</strong></p> <pre> <strong>Input:</strong> ["StockSpanner", "next", "next", "next", "next", "next", "next", "next"] [[], [100], [80], [60], [70], [60], [75], [85]]

<strong>Output:</strong> [null, 1, 1, 1, 2, 1, 4, 6]

<strong>Explanation:</strong> StockSpanner stockSpanner = new StockSpanner(); stockSpanner.next(100); // return 1 stockSpanner.next(80); // return 1 stockSpanner.next(60); // return 1 stockSpanner.next(70); // return 2 stockSpanner.next(60); // return 1 stockSpanner.next(75); // return 4 stockSpanner.next(85); // return 6 </pre>

<p>&nbsp;</p> <p><strong>Constraints:</strong></p> <ul> <li><code>1 ≤ price ≤ 10⁵</code></li> <li>At most <code>10⁴</code> calls will be made to <code>next</code>.</li> </ul>