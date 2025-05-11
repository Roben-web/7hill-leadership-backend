# Initialize a new Git repository
git init

# Add all files to staging
git add .

# Commit the changes with a message
git commit -m "Initial commit for 7 Hill Leadership Backend"

# Rename the default branch to 'main'
git branch -M main

# Add the remote GitHub repository
git remote add origin https://github.com/Roben-web/7hill-leadership-backend.git

# Push the code to GitHub on the 'main' branch
git push -u origin main
