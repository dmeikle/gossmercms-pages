ALTER TABLE cms_pages ADD COLUMN IF NOT EXISTS "deletedBy" UUID;
ALTER TABLE cms_page_sections ADD COLUMN IF NOT EXISTS "deletedBy" UUID;
ALTER TABLE cms_page_section_items ADD COLUMN IF NOT EXISTS "deletedBy" UUID;
ALTER TABLE cms_page_section_includes ADD COLUMN IF NOT EXISTS "deletedBy" UUID;
ALTER TABLE cms_page_section_details ADD COLUMN IF NOT EXISTS "deletedBy" UUID;
