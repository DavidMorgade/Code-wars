// Complete the function that calculates the area of the red square, when the length of the circular arc A is given as the input. Return the result rounded to two decimals.

// Graph

// Note: use the π value provided in your language (Math::PI, M_PI, math.pi, etc)


// Solution:

export function squareArea(arc: number): number {
    return Math.round(Math.pow((arc * 2 / Math.PI), 2) * 100) / 100;
}