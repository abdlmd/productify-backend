-- Insert sample tasks
INSERT INTO task (name, is_completed) VALUES ('Complete React project', false);
INSERT INTO task (name, is_completed) VALUES ('Fix backend API bug', true);

-- Insert sample notes
INSERT INTO note (note_description) VALUES ('Meeting notes from today.i would agree Meeting notes from today.i would agree Meeting notes from today.i would agree Meeting notes from today.i would agree');
INSERT INTO note (note_description) VALUES ('Project brainstorming ideas.');

-- Insert sample habits
INSERT INTO habit (name, completed_today, streak_days) VALUES ('Workout', false, 5);
INSERT INTO habit (name, completed_today, streak_days) VALUES ('Read book', true, 10);
