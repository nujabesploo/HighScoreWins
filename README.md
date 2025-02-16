# 🏆 HighScoreWins

## About
A simple Java program that determines the winner between two teams based on their scores. Perfect for keeping track of sports matches, gaming tournaments, or any competitive scoring system!

## How to Use
Enter scores in this format:
TeamA:TeamB|Score1:Score2

Example:
Lakers:Bulls|120:115

Input is split into:
- Team names (separated by ':')
- Scores (separated by ':')
- Teams and scores divided by '|'

## Screenshots
### Program Start
 <img src="https://github.com/user-attachments/assets/ed5fcdd3-de5c-4543-81d5-6421006936f0" width="655" alt="Screenshot 2025-02-08 at 5 29 51 PM">


### Score Result
<img src="https://github.com/user-attachments/assets/f9c476f3-1fb0-4e8b-9eca-bcf77a31ac56" width="655" alt="Screenshot 2025-02-08 at 5 30 10 PM">

## Installation & Running
# Clone repo
git clone https://github.com/yourusername/HighScoreWins.git

# Go to directory
cd HighScoreWins

# Compile
javac com/pluralsight/HighScoreWins.java

# Run
java com.pluralsight.HighScoreWins

## Features
- Parses team names and scores from input
- Handles basic error checking
- Displays winning team
- Works with any team names
- Simple and fast execution
- Clear winner display

## Sample Usage
Input: Warriors:Nets|108:105
Output: Winner: Warriors

## Common Issues & Solutions
1. Format Problems:
  - Use format: "TeamA:TeamB|Score1:Score2"
  - Include the '|' between teams and scores
  - Use ':' to separate teams and scores
  - Don't add spaces

2. Score Errors:
  - Use only numbers for scores
  - Make sure scores are valid integers

## Future Updates
- [ ] Support for multiple games
- [ ] Score history tracking
- [ ] Team statistics
- [ ] Tournament mode

## Code Overview
- Uses java.util.Scanner for input
- Uses java.util.regex.Pattern for string splitting
- Converts string scores to integers
- Compares scores to determine winner

## Contact
- Created by: Bolutife Alli
- GitHub: @nujabesploo
- Project Link: https://github.com/yourusername/HighScoreWins

🎮 Happy Scoring! 🏆
