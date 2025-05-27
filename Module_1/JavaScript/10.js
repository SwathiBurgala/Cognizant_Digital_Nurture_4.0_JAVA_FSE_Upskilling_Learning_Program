const events = [
  { name: "Yoga", date: "2025-07-01", category: "health" }
];
function logEvent({ name, date }) {
  console.log(`${name} on ${date}`);
}
const newList = [...events]; // Spread
logEvent(events[0]);
//Exercise 11
document.getElementById("regForm").addEventListener("submit", function (e) {
  e.preventDefault();
  const name = this.elements["name"].value;
  const email = this.elements["email"].value;
  const event = this.elements["event"].value;
  if (!name || !email) {
    document.getElementById("errorMsg").textContent = "All fields are required.";
    return;
  }
