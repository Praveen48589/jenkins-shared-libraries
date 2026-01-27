def cloneCode(String GitUrl, String GitBranch) {
  echo "Cloning the Code!!"
  git url: "${GitUrl}", branch: "${GitBranch}"
    
}
