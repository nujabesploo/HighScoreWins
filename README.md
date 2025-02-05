# 🏆 HighScoreWins - Game Score Calculator

## 🎮 What's This All About? 
Think of HighScoreWins as your personal sports referee in code! This Java program takes your game scores and team names, crunches the numbers, and declares the winner faster than you can say "touchdown!"

## 🎯 How It Works
The program expects input in this format:
TeamA:TeamB|Score1:Score2

For example:
Lakers:Bulls|120:115

## 📸 Project Screenshots
### Input Screen
![Input Screen](docs/images/input.png)
*Here's how the input screen looks when you run the program*

### Score Processing
![Score Processing](docs/images/processing.png)
*The program processing the team scores*

### Winner Declaration 
![Winner Screen](docs/images/winner.png)
*Final screen showing the winning team*

## 📸 How to Add Your Screenshots
1. Create a docs/images folder in your repository:
mkdir -p docs/images

2. Add your screenshots to this folder:
- input.png - Screenshot of program startup
- processing.png - Screenshot of score processing
- winner.png - Screenshot of winner announcement

3. Reference them in the README using:
![Description](docs/images/your-image.png)

## 🚀 Features
- Smart string parsing to separate team names and scores
- Robust error handling for input validation
- Clean and intuitive output format
- Support for any team names and valid scores

## 📋 Input Format Explained
RedSox:Yankees|6:4
└─┬─┘ └─┬─┘ └┬┘
 │      │    └── Team scores separated by ':'
 │      └─────── Separator between teams and scores '|'
 └────────────── Team names separated by ':'

## 🎮 How to Run
# Clone the repository
git clone https://github.com/yourusername/HighScoreWins.git

# Navigate to project directory
cd HighScoreWins

# Compile the Java file
javac com/pluralsight/HighScoreWins.java

# Run the program
java com.pluralsight.HighScoreWins

## 🛠️ Technical Details
- Input Processing:
 - Uses String.split() with regex patterns
 - Handles team names and scores separately
 - Converts string scores to integers for comparison
- Dependencies:
 - java.util.Scanner
 - java.util.regex.Pattern

## 🎯 Sample Usage
Please enter a game score: Warriors:Nets|108:105
108
105
Winner: Warriors

## 🐛 Common Issues & Solutions
1. Format Error
  - Correct format: "TeamA:TeamB|Score1:Score2"
  - Include the separator '|' between teams and scores
  - Use ':' to separate both teams and scores

2. Number Format
  - Ensure scores are valid numbers
  - Don't include spaces in the input string

## 🚀 Future Enhancements
- [ ] Support for multiple game scores
- [ ] Tournament standings calculator
- [ ] Historical game record keeping
- [ ] Team statistics tracking

## 🤝 Contributing
Got ideas for making this score calculator even better? PRs are welcome! Just make sure to:
- Follow the existing code style
- Add comments for complex logic
- Test your changes thoroughly

## 📞 Contact & Support
- Created by: Bolutife Alli
- GitHub: @nujabesploo(https://github.com/nujabesploo)

Remember: In sports as in code, it's not just about winning - it's about how you play the game! 🎮✨
